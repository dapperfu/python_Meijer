package io.constructor.data.model.dataadapter;

import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import io.constructor.data.local.PreferencesHelper;
import io.constructor.data.model.common.ResultData;
import io.constructor.data.model.common.ResultFacet;
import io.constructor.data.model.common.ResultGroup;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/constructor/data/model/dataadapter/ResultDataAdapter;", "", "<init>", "()V", "Lcom/squareup/moshi/k;", "jsonReader", "Lcom/squareup/moshi/h;", "", "Lio/constructor/data/model/common/ResultFacet;", "facetDelegate", "Lio/constructor/data/model/common/ResultGroup;", "resultGroupDelegate", "Lio/constructor/data/model/common/ResultData;", "fromJson", "(Lcom/squareup/moshi/k;Lcom/squareup/moshi/h;Lcom/squareup/moshi/h;)Lio/constructor/data/model/common/ResultData;", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class ResultDataAdapter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final k.b NAMES = k.b.a(PreferencesHelper.PREF_ID, "description", "image_url", "url", "facets", "groups");

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/constructor/data/model/dataadapter/ResultDataAdapter$Companion;", "", "<init>", "()V", "Lcom/squareup/moshi/k$b;", "kotlin.jvm.PlatformType", "NAMES", "Lcom/squareup/moshi/k$b;", "getNAMES", "()Lcom/squareup/moshi/k$b;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final k.b getNAMES() {
            return ResultDataAdapter.NAMES;
        }
    }

    @f
    public final ResultData fromJson(k jsonReader, h<List<ResultFacet>> facetDelegate, h<List<ResultGroup>> resultGroupDelegate) throws IOException {
        Intrinsics.j(jsonReader, "jsonReader");
        Intrinsics.j(facetDelegate, "facetDelegate");
        Intrinsics.j(resultGroupDelegate, "resultGroupDelegate");
        jsonReader.b();
        HashMap map = new HashMap();
        String strNextString = "";
        String strNextString2 = null;
        String strNextString3 = null;
        String strNextString4 = null;
        List<ResultGroup> listFromJsonValue = null;
        List<ResultFacet> listFromJsonValue2 = null;
        while (jsonReader.hasNext()) {
            int iZ = jsonReader.z(NAMES);
            if (iZ == 0) {
                strNextString = jsonReader.nextString();
                Intrinsics.i(strNextString, "jsonReader.nextString()");
            } else if (iZ == 1) {
                strNextString2 = jsonReader.nextString();
            } else if (iZ == 2) {
                strNextString4 = jsonReader.nextString();
            } else if (iZ == 3) {
                strNextString3 = jsonReader.nextString();
            } else if (iZ == 4) {
                listFromJsonValue2 = facetDelegate.fromJsonValue(jsonReader.w());
            } else if (iZ != 5) {
                String strNextName = jsonReader.nextName();
                Intrinsics.i(strNextName, "jsonReader.nextName()");
                map.put(strNextName, jsonReader.w());
            } else {
                listFromJsonValue = resultGroupDelegate.fromJsonValue(jsonReader.w());
            }
        }
        jsonReader.d();
        return new ResultData(strNextString2, strNextString, strNextString3, strNextString4, listFromJsonValue, listFromJsonValue2, map);
    }
}
