package com.google.maps.android;

import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mv.C15800f0;
import mv.C15805i;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/maps/android/StreetViewUtils;", "", "<init>", "()V", "Companion", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StreetViewUtils {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0002¨\u0006\u0010"}, d2 = {"Lcom/google/maps/android/StreetViewUtils$Companion;", "", "<init>", "()V", "fetchStreetViewData", "Lcom/google/maps/android/Status;", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "apiKey", "", "source", "Lcom/google/maps/android/Source;", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Lcom/google/maps/android/Source;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deserializeResponse", "Lcom/google/maps/android/ResponseStreetView;", "responseString", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ResponseStreetView deserializeResponse(String responseString) {
            String strOptString = new JSONObject(responseString).optString("status");
            Intrinsics.g(strOptString);
            return new ResponseStreetView(Status.valueOf(strOptString));
        }

        public static /* synthetic */ Object fetchStreetViewData$default(Companion companion, LatLng latLng, String str, Source source, Continuation continuation, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                source = Source.DEFAULT;
            }
            return companion.fetchStreetViewData(latLng, str, source, continuation);
        }

        public final Object fetchStreetViewData(LatLng latLng, String str, Source source, Continuation<? super Status> continuation) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("https://maps.googleapis.com/maps/api/streetview/metadata");
            sb2.append("?location=" + latLng.f85654a + "," + latLng.f85655b);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("&key=");
            sb3.append(str);
            sb2.append(sb3.toString());
            sb2.append("&source=" + source.getValue());
            return C15805i.g(C15800f0.b(), new StreetViewUtils$Companion$fetchStreetViewData$2(sb2.toString(), null), continuation);
        }
    }
}
