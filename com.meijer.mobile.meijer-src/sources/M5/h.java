package M5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a3\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005*\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"T", "Lorg/json/JSONArray;", "Lkotlin/Function1;", "", "transform", "", "a", "(Lorg/json/JSONArray;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Lorg/json/JSONObject;", "", "", "c", "(Lorg/json/JSONObject;)Ljava/util/Map;", "b", "(Lorg/json/JSONArray;)Ljava/util/List;", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "", "it", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f19669f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ JSONArray f19670g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, JSONArray jSONArray) {
            super(1);
            this.f19669f = function1;
            this.f19670g = jSONArray;
        }

        public final Object a(int i10) throws JSONException {
            Function1 function1 = this.f19669f;
            Object obj = this.f19670g.get(i10);
            Intrinsics.i(obj, "this.get(it)");
            return function1.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final /* synthetic */ List a(JSONArray jSONArray, Function1 transform) {
        Intrinsics.j(jSONArray, "<this>");
        Intrinsics.j(transform, "transform");
        return SequencesKt.X(SequencesKt.M(CollectionsKt.f0(RangesKt.x(0, jSONArray.length())), new a(transform, jSONArray)));
    }

    public static final /* synthetic */ List b(JSONArray jSONArray) throws JSONException {
        Intrinsics.j(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = RangesKt.x(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((IntIterator) it).nextInt());
            if (obj instanceof JSONObject) {
                arrayList.add(c((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                arrayList.add(b((JSONArray) obj));
            } else if (Intrinsics.e(obj, JSONObject.NULL)) {
                arrayList.add(null);
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ Map c(JSONObject jSONObject) throws JSONException {
        Intrinsics.j(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.i(itKeys, "this.keys()");
        Sequence sequenceH = SequencesKt.h(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceH) {
            Object objB = jSONObject.get((String) obj);
            if (objB instanceof JSONObject) {
                objB = c((JSONObject) objB);
            } else if (objB instanceof JSONArray) {
                objB = b((JSONArray) objB);
            } else if (Intrinsics.e(objB, JSONObject.NULL)) {
                objB = null;
            }
            linkedHashMap.put(obj, objB);
        }
        return linkedHashMap;
    }
}
