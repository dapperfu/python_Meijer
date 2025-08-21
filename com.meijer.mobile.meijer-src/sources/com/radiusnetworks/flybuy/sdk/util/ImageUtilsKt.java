package com.radiusnetworks.flybuy.sdk.util;

import android.graphics.drawable.Drawable;
import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toDrawableFromUrl", "Landroid/graphics/drawable/Drawable;", "", "common_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageUtilsKt {
    public static final Drawable toDrawableFromUrl(String str) throws IOException {
        Intrinsics.j(str, "<this>");
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(new URL(str).openConnection()));
        Intrinsics.h(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        httpURLConnection.setRequestProperty("User-agent", "Mozilla/4.0");
        httpURLConnection.connect();
        return Drawable.createFromStream(httpURLConnection.getInputStream(), str);
    }
}
