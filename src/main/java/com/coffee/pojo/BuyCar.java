package com.coffee.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName buy_car
 */
@TableName(value ="buy_car")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BuyCar {
    /**
     * 
     */
    private String ctime;

    /**
     * 
     */
    private String uno;

    /**
     * 
     */
    private String tname;

    /**
     * 
     */
    private Integer csum;

    /**
     * 
     */
    private Integer ccup;

    /**
     * 
     */
    private Integer ctemp;

    /**
     * 
     */
    private Integer csweetness;

    /**
     * 
     */
    private Integer ctno;

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
        BuyCar other = (BuyCar) that;
        return (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getUno() == null ? other.getUno() == null : this.getUno().equals(other.getUno()))
            && (this.getTname() == null ? other.getTname() == null : this.getTname().equals(other.getTname()))
            && (this.getCsum() == null ? other.getCsum() == null : this.getCsum().equals(other.getCsum()))
            && (this.getCcup() == null ? other.getCcup() == null : this.getCcup().equals(other.getCcup()))
            && (this.getCtemp() == null ? other.getCtemp() == null : this.getCtemp().equals(other.getCtemp()))
            && (this.getCsweetness() == null ? other.getCsweetness() == null : this.getCsweetness().equals(other.getCsweetness()))
            && (this.getCtno() == null ? other.getCtno() == null : this.getCtno().equals(other.getCtno()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getUno() == null) ? 0 : getUno().hashCode());
        result = prime * result + ((getTname() == null) ? 0 : getTname().hashCode());
        result = prime * result + ((getCsum() == null) ? 0 : getCsum().hashCode());
        result = prime * result + ((getCcup() == null) ? 0 : getCcup().hashCode());
        result = prime * result + ((getCtemp() == null) ? 0 : getCtemp().hashCode());
        result = prime * result + ((getCsweetness() == null) ? 0 : getCsweetness().hashCode());
        result = prime * result + ((getCtno() == null) ? 0 : getCtno().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ctime=").append(ctime);
        sb.append(", uno=").append(uno);
        sb.append(", tname=").append(tname);
        sb.append(", csum=").append(csum);
        sb.append(", ccup=").append(ccup);
        sb.append(", ctemp=").append(ctemp);
        sb.append(", csweetness=").append(csweetness);
        sb.append(", ctno=").append(ctno);
        sb.append("]");
        return sb.toString();
    }
}