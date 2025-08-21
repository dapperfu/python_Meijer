package ph;

import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonWriter;
import com.launchdarkly.sdk.AttributeRef;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oh.AbstractC16130a;

/* renamed from: ph.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C16434k {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f156524a;

    /* renamed from: b, reason: collision with root package name */
    private final AttributeRef[] f156525b;

    private static <T> List<T> a(List<T> list, T t10) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(t10);
        return list;
    }

    private AttributeRef b(LDContext lDContext, int i10, String str, AttributeRef attributeRef) {
        AttributeRef[] attributeRefArr = this.f156525b;
        AttributeRef attributeRef2 = null;
        if (attributeRefArr.length != 0) {
            for (AttributeRef attributeRef3 : attributeRefArr) {
                if (d(attributeRef3, i10, str, attributeRef)) {
                    if (attributeRef3.m() == i10) {
                        return attributeRef3;
                    }
                    attributeRef2 = attributeRef3;
                }
            }
        }
        for (int i11 = 0; i11 < lDContext.r(); i11++) {
            AttributeRef attributeRefQ = lDContext.q(i11);
            if (d(attributeRefQ, i10, str, attributeRef)) {
                if (attributeRefQ.m() == i10) {
                    return attributeRefQ;
                }
                attributeRef2 = attributeRefQ;
            }
        }
        return attributeRef2;
    }

    private boolean c(LDContext lDContext, String str, boolean z10) {
        if (this.f156524a) {
            return true;
        }
        if (z10 && lDContext.u()) {
            return true;
        }
        AttributeRef attributeRefB = b(lDContext, 1, str, null);
        return attributeRefB != null && attributeRefB.m() == 1;
    }

    private List<String> g(JsonWriter jsonWriter, LDContext lDContext, String str, LDValue lDValue, List<String> list, boolean z10) throws IOException {
        return this.f156524a ? a(list, str) : (z10 && lDContext.u()) ? a(list, str) : h(jsonWriter, lDContext, 0, str, lDValue, null, list);
    }

    private List<String> h(JsonWriter jsonWriter, LDContext lDContext, int i10, String str, LDValue lDValue, AttributeRef attributeRef, List<String> list) throws JsonIOException, IOException {
        int i11 = i10 + 1;
        AttributeRef attributeRefB = b(lDContext, i11, str, attributeRef);
        if (attributeRefB != null && attributeRefB.m() == i11) {
            return a(list, attributeRefB.toString());
        }
        if (attributeRefB == null || lDValue.h() != com.launchdarkly.sdk.i.OBJECT) {
            f(jsonWriter, str, lDValue);
            return list;
        }
        jsonWriter.name(str).beginObject();
        List<String> listH = list;
        for (String str2 : lDValue.m()) {
            listH = h(jsonWriter, lDContext, i11, str2, lDValue.g(str2), attributeRefB, listH);
        }
        jsonWriter.endObject();
        return listH;
    }

    C16434k(boolean z10, AttributeRef[] attributeRefArr) {
        this.f156524a = z10;
        this.f156525b = attributeRefArr == null ? new AttributeRef[0] : attributeRefArr;
    }

    private static boolean d(AttributeRef attributeRef, int i10, String str, AttributeRef attributeRef2) {
        if (attributeRef.m() < i10) {
            return false;
        }
        int i11 = 0;
        while (true) {
            int i12 = i10 - 1;
            if (i11 < i12) {
                if (!attributeRef.l(i11).equals(attributeRef2.l(i11))) {
                    return false;
                }
                i11++;
            } else {
                return attributeRef.l(i12).equals(str);
            }
        }
    }

    private static void f(JsonWriter jsonWriter, String str, LDValue lDValue) throws JsonIOException, IOException {
        jsonWriter.name(str);
        AbstractC16130a.a().C(lDValue, LDValue.class, jsonWriter);
    }

    private void i(LDContext lDContext, JsonWriter jsonWriter, boolean z10, boolean z11) throws IOException {
        jsonWriter.beginObject();
        if (z10) {
            jsonWriter.name("kind").value(lDContext.o().toString());
        }
        jsonWriter.name("key").value(lDContext.n());
        if (lDContext.u()) {
            jsonWriter.name("anonymous").value(true);
        }
        List<String> listA = null;
        if (lDContext.p() != null) {
            if (c(lDContext, "name", z11)) {
                listA = a(null, "name");
            } else {
                jsonWriter.name("name").value(lDContext.p());
            }
        }
        List<String> listG = listA;
        for (String str : lDContext.h()) {
            listG = g(jsonWriter, lDContext, str, lDContext.t(str), listG, z11);
        }
        if (listG != null && !listG.isEmpty()) {
            jsonWriter.name("_meta").beginObject();
            jsonWriter.name("redactedAttributes").beginArray();
            Iterator<String> it = listG.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next());
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    public void e(LDContext lDContext, JsonWriter jsonWriter, boolean z10) throws IOException {
        if (lDContext.v()) {
            jsonWriter.beginObject();
            jsonWriter.name("kind").value("multi");
            for (int i10 = 0; i10 < lDContext.m(); i10++) {
                LDContext lDContextK = lDContext.k(i10);
                jsonWriter.name(lDContextK.o().toString());
                i(lDContextK, jsonWriter, false, z10);
            }
            jsonWriter.endObject();
            return;
        }
        i(lDContext, jsonWriter, true, z10);
    }
}
