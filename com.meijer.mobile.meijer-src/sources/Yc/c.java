package Yc;

import android.net.Uri;
import com.google.android.gms.internal.ads.C8253gg;
import java.util.Map;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f43041a = (String) C8253gg.f75207a.e();

    public String a(Map<String, String> map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f43041a).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
