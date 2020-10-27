package com.filemanager;

public class File {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // Related to all files
    public void Open() {
        System.out.println("File Opened");
    }

    public void Copy() {
        System.out.println("File Copied");
    }

    public void Delete() {
        System.out.println("File Deleted");
    }

    // Media Files

    public static class Media extends File {

        public Media(String name, int size) {
            super(name, size);
        }

        static class Sound extends Media { // Could also extend the File class

            private int totalPlayTime;

            public Sound(String name, int size, int totalPlayTime) {
                super(name, size);
                this.totalPlayTime = totalPlayTime;

            }

            public int getTotalPlayTime() {
                return totalPlayTime;
            }

            public void setTotalPlayTime(int totalPlayTime) {
                this.totalPlayTime = totalPlayTime;
            }

            public void play() {
                System.out.println("You are playing " + this.getName() + " for " + this.totalPlayTime + " minutes, with size " + this.getSize() + "mb");
            }

        }


        static class Picture extends Media {

            private int width;
            private int height;

            public Picture(String name, int size, int width, int height) {
                super(name, size);
                this.width = width;
                this.height = height;
            }


            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public void print () {
                System.out.println("You printed a " + this.width + "x" + this.height + " Picture.");
            }

        }

        @Override
        public void Open() {
            super.Open();
        }

        @Override
        public void Copy() {
            super.Copy();
        }

        @Override
        public void Delete() {
            super.Delete();
        }
    }
}
