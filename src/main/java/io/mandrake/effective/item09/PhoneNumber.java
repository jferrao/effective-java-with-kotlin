package io.mandrake.effective.item09;

import java.util.Objects;

public class PhoneNumber {
    private final String internationalCode;
    private final String areaCode;
    private final String lineNumber;

    public PhoneNumber(String areaCode, String lineNumber) {
        this("+44", areaCode, lineNumber);
    }

    public PhoneNumber(String internationalCode, String areaCode, String lineNumber) {
        this.internationalCode = internationalCode;
        this.areaCode = areaCode;
        this.lineNumber = lineNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(internationalCode, that.internationalCode) &&
                Objects.equals(areaCode, that.areaCode) &&
                Objects.equals(lineNumber, that.lineNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internationalCode, areaCode, lineNumber);
    }

    @Override
    public String toString() {
        return "PhoneNumber(internationalCode=" + internationalCode +
                ", areaCode=" + areaCode + ", lineNumber=" + lineNumber + ')';
    }

}
