package Fa;

import B9.ResponseModel;
import Ga.Product;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\b\u0017\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\nH\u0012¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LFa/f;", "LQ8/c;", "LB9/c;", "", "LGa/c;", "<init>", "()V", "", "feature", "cohort", "", "productFields", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)LGa/c;", "responseModel", "c", "(LB9/c;)Ljava/util/List;", "predict_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class f implements Q8.c<ResponseModel, List<? extends Product>> {
    @Override // Q8.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<Product> a(ResponseModel responseModel) throws JSONException {
        Intrinsics.j(responseModel, "responseModel");
        ArrayList arrayList = new ArrayList();
        try {
            String body = responseModel.getBody();
            if (body != null) {
                JSONObject jSONObject = new JSONObject(body);
                if (jSONObject.has("products")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("products");
                    JSONObject jSONObject3 = jSONObject.getJSONObject("features");
                    String string = jSONObject.getString("cohort");
                    Iterator<String> itKeys = jSONObject3.keys();
                    Intrinsics.i(itKeys, "keys(...)");
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONArray jSONArray = jSONObject3.getJSONObject(next).getJSONArray("items");
                        int length = jSONArray.length();
                        for (int i10 = 0; i10 < length; i10++) {
                            JSONObject jSONObject4 = jSONObject2.getJSONObject(jSONArray.getJSONObject(i10).getString(PreferencesHelper.PREF_ID));
                            Intrinsics.g(jSONObject4);
                            Map<String, String> mapE = G9.h.e(jSONObject4);
                            Intrinsics.g(next);
                            Intrinsics.g(string);
                            arrayList.add(b(next, string, mapE));
                        }
                    }
                }
            }
            return arrayList;
        } catch (JSONException e10) {
            I9.e.INSTANCE.c(new J9.b(e10, null, 2, null));
            return arrayList;
        }
    }

    private Product b(String feature, String cohort, Map<String, String> productFields) {
        Boolean boolValueOf;
        Float fValueOf;
        Float fValueOf2;
        Map mapD = MapsKt.D(productFields);
        String str = (String) mapD.remove("msrp");
        String str2 = (String) mapD.remove("price");
        String str3 = (String) mapD.remove("available");
        Object objRemove = mapD.remove("item");
        Intrinsics.g(objRemove);
        String str4 = (String) objRemove;
        Object objRemove2 = mapD.remove("title");
        Intrinsics.g(objRemove2);
        String str5 = (String) objRemove2;
        Object objRemove3 = mapD.remove("link");
        Intrinsics.g(objRemove3);
        String str6 = (String) objRemove3;
        String str7 = (String) mapD.remove("category");
        Integer numValueOf = null;
        if (str3 != null) {
            boolValueOf = Boolean.valueOf(Boolean.parseBoolean(str3));
        } else {
            boolValueOf = null;
        }
        if (str != null) {
            fValueOf = Float.valueOf(Float.parseFloat(str));
        } else {
            fValueOf = null;
        }
        if (str2 != null) {
            fValueOf2 = Float.valueOf(Float.parseFloat(str2));
        } else {
            fValueOf2 = null;
        }
        String str8 = (String) mapD.remove("image");
        String str9 = (String) mapD.remove("zoom_image");
        String str10 = (String) mapD.remove("description");
        String str11 = (String) mapD.remove("album");
        String str12 = (String) mapD.remove("actor");
        String str13 = (String) mapD.remove("artist");
        String str14 = (String) mapD.remove("author");
        String str15 = (String) mapD.remove("brand");
        String str16 = (String) mapD.remove("year");
        if (str16 != null) {
            numValueOf = Integer.valueOf(Integer.parseInt(str16));
        }
        return new Product(str4, str5, str6, feature, cohort, mapD, str8, null, str9, null, str7, boolValueOf, str10, fValueOf2, fValueOf, str11, str12, str13, str14, str15, numValueOf, 640, null);
    }
}
