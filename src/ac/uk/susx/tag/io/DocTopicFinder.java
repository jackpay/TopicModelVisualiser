package ac.uk.susx.tag.io;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class DocTopicFinder {
	
	private final String fileLoc;
	private final String outLoc;
	private final String docModelLoc;
	private final String indexLoc;
	private final int n;
	
	
	public DocTopicFinder(String fileLoc, String outLoc, int n, String docModelLoc, String indexLoc) {
		this.fileLoc = fileLoc;
		this.outLoc = outLoc;
		this.n = n;
		this.indexLoc = indexLoc;
		this.docModelLoc = docModelLoc;
	}
	
	private List<String> getDocNames() {
		return null;
	}
	
	private List<File> getDocs(List<String> docNames) {
		return null;
	}
	
	private void copyDocs(List<File> docs) {
		for(File file : docs) {
			File copyFile = new File(outLoc + "/" + file.getName());
			try {
				FileUtils.copyFile(file, copyFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void buildDocList() {
		copyDocs(getDocs(getDocNames()));
	}

}
