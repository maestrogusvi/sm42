package com.ut.sm42.dto;

public class CatzinDTO {
        int id;
        String name;
        String status;
        public CatzinDTO() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }


    public String toString() {
        return "CatzinlDTO{" +
                "id=" + id + '\'' +
                ",status=" + status + '\'' +
                ",name=" + name + '\'' +
                '}';
    }

    public String toJSON() {
        return "CatzinDTO{" +
                "\"id\":" + "\""+id+"\","+
                "\"status\":" + "\""+status+"\","+
                "\"name\":" + "\""+name+"\""+
                '}';
    }
    }


