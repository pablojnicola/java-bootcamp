package com.globant.bootcamp.recentFileList;

public class FileAttached {

	private String sourceFolderDirectory;
	private String fileExtension;
	private String fileName;

	public FileAttached(String sourceFolderDirectory, String fileExtension, String fileName) {

		this.sourceFolderDirectory = sourceFolderDirectory;
		this.fileExtension = fileExtension;
		this.fileName=fileName;

	}

	public String getSourceFolderDirectory() {

		return sourceFolderDirectory;

	}

	public String getFileExtension() {

		return fileExtension;

	}

}
