package com.google.android.libraries.places.api.model.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.EncodedPolyline;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002¨\u0006\u0003"}, d2 = {"encodedPolyline", "Lcom/google/android/libraries/places/api/model/EncodedPolyline;", "", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EncodedPolylineKt {
    public static final EncodedPolyline encodedPolyline(@RecentlyNonNull String encodedPolyline) {
        Intrinsics.j(encodedPolyline, "encodedPolyline");
        EncodedPolyline encodedPolylineNewInstance = EncodedPolyline.newInstance(encodedPolyline);
        Intrinsics.i(encodedPolylineNewInstance, "newInstance(...)");
        return encodedPolylineNewInstance;
    }
}
