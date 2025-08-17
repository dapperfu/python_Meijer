package com.bazaarvoice.bvandroidsdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class ReviewHighlights {
    private transient List<ReviewHighlight> negatives;

    @InterfaceC15617c("negative")
    private Map<String, ReviewHighlight> negativesMap;
    private transient List<ReviewHighlight> positives;

    @InterfaceC15617c("positive")
    private Map<String, ReviewHighlight> positivesMap;

    private List<ReviewHighlight> processContent(Map<String, ReviewHighlight> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry<String, ReviewHighlight> entry : map.entrySet()) {
                entry.getValue().title = entry.getKey();
                arrayList.add(entry.getValue());
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.bazaarvoice.bvandroidsdk.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((ReviewHighlight) obj2).mentionsCount.intValue(), ((ReviewHighlight) obj).mentionsCount.intValue());
            }
        });
        return arrayList;
    }

    public List<ReviewHighlight> getNegatives() {
        if (this.negatives == null) {
            this.negatives = processContent(this.negativesMap);
        }
        return this.negatives;
    }

    public List<ReviewHighlight> getPositives() {
        if (this.positives == null) {
            this.positives = processContent(this.positivesMap);
        }
        return this.positives;
    }
}
