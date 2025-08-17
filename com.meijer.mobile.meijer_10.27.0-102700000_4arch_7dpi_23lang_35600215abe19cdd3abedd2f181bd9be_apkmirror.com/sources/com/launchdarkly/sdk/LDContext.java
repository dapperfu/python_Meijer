package com.launchdarkly.sdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import mg.InterfaceC15616b;

@InterfaceC15616b(LDContextTypeAdapter.class)
/* loaded from: classes7.dex */
public final class LDContext implements com.launchdarkly.sdk.json.c {
    static final String ATTR_ANONYMOUS = "anonymous";
    static final String ATTR_KEY = "key";
    static final String ATTR_KIND = "kind";
    static final String ATTR_NAME = "name";
    final boolean anonymous;
    final b attributes;
    final String error;
    final String fullyQualifiedKey;
    final String key;
    final d kind;
    final LDContext[] multiContexts;
    final String name;
    final List<AttributeRef> privateAttributes;

    private LDContext(d dVar, LDContext[] lDContextArr, String str, String str2, String str3, b bVar, boolean z10, List<AttributeRef> list) {
        this.error = null;
        this.kind = dVar == null ? d.f91300b : dVar;
        this.multiContexts = lDContextArr;
        this.key = str;
        this.fullyQualifiedKey = str2;
        this.name = str3;
        this.attributes = bVar;
        this.anonymous = z10;
        this.privateAttributes = list;
    }

    static LDContext d(LDContext[] lDContextArr) {
        ArrayList<String> arrayList = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < lDContextArr.length; i10++) {
            LDContext lDContext = lDContextArr[i10];
            if (lDContext.w()) {
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        break;
                    }
                    if (Objects.equals(lDContextArr[i11].o(), lDContext.o())) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lDContext.i());
            }
        }
        if (z10) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add("multi-kind context cannot have same kind more than once");
        }
        if (arrayList != null) {
            StringBuilder sb2 = new StringBuilder();
            for (String str : arrayList) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
            }
            return g(sb2.toString());
        }
        Arrays.sort(lDContextArr, a.f90998a);
        StringBuilder sb3 = new StringBuilder();
        for (LDContext lDContext2 : lDContextArr) {
            if (sb3.length() != 0) {
                sb3.append(':');
            }
            sb3.append(lDContext2.o().toString());
            sb3.append(':');
            sb3.append(f(lDContext2.n()));
        }
        return new LDContext(d.f91301c, lDContextArr, "", sb3.toString(), null, null, false, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LDContext)) {
            return false;
        }
        LDContext lDContext = (LDContext) obj;
        if (!Objects.equals(this.error, lDContext.error)) {
            return false;
        }
        if (this.error != null) {
            return true;
        }
        if (!Objects.equals(this.kind, lDContext.kind)) {
            return false;
        }
        if (!v()) {
            if (!Objects.equals(this.key, lDContext.key) || !Objects.equals(this.name, lDContext.name) || this.anonymous != lDContext.anonymous || !Objects.equals(this.attributes, lDContext.attributes) || r() != lDContext.r()) {
                return false;
            }
            List<AttributeRef> list = this.privateAttributes;
            if (list != null) {
                for (AttributeRef attributeRef : list) {
                    Iterator<AttributeRef> it = lDContext.privateAttributes.iterator();
                    while (it.hasNext()) {
                        if (it.next().equals(attributeRef)) {
                            break;
                        }
                    }
                    return false;
                }
            }
            return true;
        }
        if (this.multiContexts.length != lDContext.multiContexts.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            LDContext[] lDContextArr = this.multiContexts;
            if (i10 >= lDContextArr.length) {
                return true;
            }
            if (!Objects.equals(lDContextArr[i10], lDContext.multiContexts[i10])) {
                return false;
            }
            i10++;
        }
    }

    private static class a implements Comparator<LDContext> {

        /* renamed from: a, reason: collision with root package name */
        static final a f90998a = new a();

        private a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(LDContext lDContext, LDContext lDContext2) {
            return lDContext.o().compareTo(lDContext2.o());
        }
    }

    public static c a(d dVar, String str) {
        return new c(dVar, str);
    }

    public static c b(String str) {
        return a(d.f91300b, str);
    }

    public static c c(LDContext lDContext) {
        return new c().c(lDContext);
    }

    static LDContext e(d dVar, String str, String str2, b bVar, boolean z10, List<AttributeRef> list, boolean z11) {
        String str3;
        String strL;
        if (dVar != null && (strL = dVar.l()) != null) {
            return g(strL);
        }
        if (str == null || (str.isEmpty() && !z11)) {
            return g("context key must not be null or empty");
        }
        if (dVar.b()) {
            str3 = str;
        } else {
            str3 = dVar.toString() + ":" + f(str);
        }
        return new LDContext(dVar, null, str, str3, str2, bVar, z10, list);
    }

    private static String f(String str) {
        return str.replace("%", "%25").replace(":", "%3A");
    }

    static LDContext g(String str) {
        return new LDContext(str);
    }

    public static e x() {
        return new e();
    }

    public Iterable<String> h() {
        b bVar = this.attributes;
        return bVar == null ? Collections.EMPTY_LIST : bVar.a().keySet();
    }

    public int hashCode() {
        int iHash = Objects.hash(this.error, this.kind, this.key, this.name, Boolean.valueOf(this.anonymous));
        LDContext[] lDContextArr = this.multiContexts;
        if (lDContextArr != null) {
            for (LDContext lDContext : lDContextArr) {
                iHash = (iHash * 17) + lDContext.hashCode();
            }
        }
        b bVar = this.attributes;
        if (bVar != null) {
            iHash = (iHash * 17) + bVar.hashCode();
        }
        List<AttributeRef> list = this.privateAttributes;
        if (list != null) {
            AttributeRef[] attributeRefArr = (AttributeRef[]) list.toArray(new AttributeRef[list.size()]);
            Arrays.sort(attributeRefArr);
            for (AttributeRef attributeRef : attributeRefArr) {
                iHash = (iHash * 17) + attributeRef.hashCode();
            }
        }
        return iHash;
    }

    public String i() {
        return this.error;
    }

    public String j() {
        return this.fullyQualifiedKey;
    }

    public LDContext k(int i10) {
        LDContext[] lDContextArr = this.multiContexts;
        if (lDContextArr == null) {
            if (i10 == 0) {
                return this;
            }
            return null;
        }
        if (i10 < 0 || i10 >= lDContextArr.length) {
            return null;
        }
        return lDContextArr[i10];
    }

    public LDContext l(d dVar) {
        if (dVar == null) {
            dVar = d.f91300b;
        }
        LDContext[] lDContextArr = this.multiContexts;
        if (lDContextArr == null) {
            if (dVar.equals(this.kind)) {
                return this;
            }
            return null;
        }
        for (LDContext lDContext : lDContextArr) {
            if (dVar.equals(lDContext.kind)) {
                return lDContext;
            }
        }
        return null;
    }

    public int m() {
        if (this.error != null) {
            return 0;
        }
        LDContext[] lDContextArr = this.multiContexts;
        if (lDContextArr == null) {
            return 1;
        }
        return lDContextArr.length;
    }

    public String n() {
        return this.key;
    }

    public d o() {
        return this.kind;
    }

    public String p() {
        return this.name;
    }

    public AttributeRef q(int i10) {
        List<AttributeRef> list = this.privateAttributes;
        if (list != null && i10 >= 0 && i10 < list.size()) {
            return this.privateAttributes.get(i10);
        }
        return null;
    }

    public int r() {
        List<AttributeRef> list = this.privateAttributes;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public boolean u() {
        return this.anonymous;
    }

    public boolean v() {
        return this.multiContexts != null;
    }

    public boolean w() {
        return this.error == null;
    }

    private LDValue s(String str) {
        str.getClass();
        switch (str) {
            case "anonymous":
                break;
            case "key":
                if (this.multiContexts != null) {
                    break;
                } else {
                    break;
                }
            case "kind":
                break;
            case "name":
                break;
            default:
                b bVar = this.attributes;
                if (bVar != null) {
                    LDValue lDValueC = bVar.c(str);
                    if (lDValueC == null) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return LDValue.u();
    }

    public LDValue t(String str) {
        return s(str);
    }

    public String toString() {
        if (!w()) {
            return "(invalid LDContext: " + i() + ")";
        }
        return com.launchdarkly.sdk.json.d.d(this);
    }

    private LDContext(String str) {
        this.error = str;
        this.kind = null;
        this.multiContexts = null;
        this.key = "";
        this.fullyQualifiedKey = "";
        this.name = null;
        this.attributes = null;
        this.anonymous = false;
        this.privateAttributes = null;
    }
}
