package com.coffee.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * 
     */
    private String uno;

    /**
     * 
     */
    private String uname;

    /**
     * 
     */
    private String upassword;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUno() == null ? other.getUno() == null : this.getUno().equals(other.getUno()))
            && (this.getUname() == null ? other.getUname() == null : this.getUname().equals(other.getUname()))
            && (this.getUpassword() == null ? other.getUpassword() == null : this.getUpassword().equals(other.getUpassword()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUno() == null) ? 0 : getUno().hashCode());
        result = prime * result + ((getUname() == null) ? 0 : getUname().hashCode());
        result = prime * result + ((getUpassword() == null) ? 0 : getUpassword().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uno=").append(uno);
        sb.append(", uname=").append(uname);
        sb.append(", upassword=").append(upassword);
        sb.append("]");
        return sb.toString();
    }
}