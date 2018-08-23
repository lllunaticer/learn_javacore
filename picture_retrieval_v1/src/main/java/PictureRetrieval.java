import java.io.File;
import java.io.FileInputStream;

import javax.imageio.ImageIO;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

import net.semanticmetadata.lire.imageanalysis.features.GlobalFeature;
import net.semanticmetadata.lire.imageanalysis.features.global.PHOG;
import net.semanticmetadata.lire.indexers.hashing.BitSampling;

public class PictureRetrieval {
    public static void main(String[] args) throws Exception {

        System.out.println("Images Indexing!");
        int number = 0;

        String path = "C:\\Users\\lunat\\OneDrive\\Wallpaper";
        File file = new File(path);
        File[] tempList = file.listFiles();
        System.out.println("The number of Files: " + tempList.length);

        for (int i = 0; i < tempList.length; i++) {
            String imgpath = tempList[i].toString();
            System.out.println(imgpath);

            BufferedImage img = null;
            GlobalFeature f = null;

            img = ImageIO.read(new FileInputStream(path));
            f = new PHOG();
            f.extract(img);
            double[] temp = f.getFeatureVector();

            BitSampling.readHashFunctions();
            int[] intArr=BitSampling.generateHashes(temp);
            String hashcode = arrayToString(intArr);
            System.out.println(hashcode);
        }
    }
}
