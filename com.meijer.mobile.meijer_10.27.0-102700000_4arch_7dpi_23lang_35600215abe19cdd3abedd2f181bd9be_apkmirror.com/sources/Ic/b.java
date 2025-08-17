package Ic;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes4.dex */
final class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f13808a;

    b(a aVar, Map map) {
        this.f13808a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f13808a;
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        d.a(builderBuildUpon.build().toString());
    }
}
