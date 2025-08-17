package com.google.maps.model;

import com.google.maps.model.AutocompletePrediction;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class AutocompleteStructuredFormatting implements Serializable {
    private static final long serialVersionUID = 1;
    public String mainText;
    public AutocompletePrediction.MatchedSubstring[] mainTextMatchedSubstrings;
    public String secondaryText;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append("\"");
        sb2.append(this.mainText);
        sb2.append("\"");
        sb2.append(" at ");
        sb2.append(Arrays.toString(this.mainTextMatchedSubstrings));
        if (this.secondaryText != null) {
            sb2.append(", secondaryText=\"");
            sb2.append(this.secondaryText);
            sb2.append("\"");
        }
        sb2.append(")");
        return sb2.toString();
    }
}
