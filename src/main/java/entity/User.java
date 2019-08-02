package entity;

import java.io.Serializable;

public class User implements Serializable {
        private int id;
        private String account;
        private String password;
        private String role;
        private String isDel;
        private int preId;


        public User() {
            super();
        }

        public User(String account, String password, String role,String isDel, int preId) {
            super();
            this.account = account;
            this.password = password;
            this.role = role;
            this.preId = preId;
            this.isDel=isDel;
        }

        public User(int id, String account, String password, String role,String isDel,int preId) {
            super();
            this.id = id;
            this.account = account;
            this.password = password;
            this.role = role;
            this.isDel=isDel;
            this.preId=preId;
        }

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getAccount() {
            return account;
        }
        public void setAccount(String account) {
            this.account = account;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public String getRole() {
            return role;
        }
        public void setRole(String role) {
            this.role = role;
        }
        public int getPreId() {
            return preId;
        }
        public void setPreId(int preId) {
            this.preId = preId;
        }

        public String getIsDel() {
            return isDel;
        }

        public void setIsDel(String isDel) {
            this.isDel = isDel;
        }

        @Override
        public String toString() {
            return "User [id=" + id + ", account=" + account + ", password=" + password + ", role=" + role + ", isDel="
                    + isDel + ", preId=" + preId + "]";
        }



    }

