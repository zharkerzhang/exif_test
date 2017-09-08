package com.zharker;

import com.drew.imaging.jpeg.JpegMetadataReader;
import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.exif.ExifDirectoryBase;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class EXIFTest {

    @Test
    public void testBase() throws JpegProcessingException, IOException {
        String testPath = "D:\\idea_\\projects\\exif_test\\src\\main\\resources\\test_imgs\\test_img2.jpg";

        File jpegFile = new File(testPath);
        Metadata metadata = JpegMetadataReader.readMetadata(jpegFile);

        metadata.getDirectories().forEach(dir->{
            System.out.println("============="+dir.getName()+"===============");
            dir.getTags().stream().forEach(tag->{
                System.out.println(tag.getTagName()+":"+tag.getDescription());
            });
        });

       /* metadata.getDirectories().forEach(dir->{

        });*/


    }
}
