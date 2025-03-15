package com.coffee.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName bought
 */
@TableName(value ="bought")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bought {
    /**
     * 
     */
    private String bno;

    /**
     * 
     */
    private String btime;

    /**
     * 
     */
    private String btype;

    /**
     * 
     */
    private Double bprice;

    /**
     * 
     */
    private String uno;

    /**
     * 
     */
    private Integer bdno;

    /**
     * 
     */
    private Integer bsum;

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
        Bought other = (Bought) that;
        return (this.getBno() == null ? other.getBno() == null : this.getBno().equals(other.getBno()))
            && (this.getBtime() == null ? other.getBtime() == null : this.getBtime().equals(other.getBtime()))
            && (this.getBtype() == null ? other.getBtype() == null : this.getBtype().equals(other.getBtype()))
            && (this.getBprice() == null ? other.getBprice() == null : this.getBprice().equals(other.getBprice()))
            && (this.getUno() == null ? other.getUno() == null : this.getUno().equals(other.getUno()))
            && (this.getBdno() == null ? other.getBdno() == null : this.getBdno().equals(other.getBdno()))
            && (this.getBsum() == null ? other.getBsum() == null : this.getBsum().equals(other.getBsum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBno() == null) ? 0 : getBno().hashCode());
        result = prime * result + ((getBtime() == null) ? 0 : getBtime().hashCode());
        result = prime * result + ((getBtype() == null) ? 0 : getBtype().hashCode());
        result = prime * result + ((getBprice() == null) ? 0 : getBprice().hashCode());
        result = prime * result + ((getUno() == null) ? 0 : getUno().hashCode());
        result = prime * result + ((getBdno() == null) ? 0 : getBdno().hashCode());
        result = prime * result + ((getBsum() == null) ? 0 : getBsum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bno=").append(bno);
        sb.append(", btime=").append(btime);
        sb.append(", btype=").append(btype);
        sb.append(", bprice=").append(bprice);
        sb.append(", uno=").append(uno);
        sb.append(", bdno=").append(bdno);
        sb.append(", bsum=").append(bsum);
        sb.append("]");
        return sb.toString();
    }
}