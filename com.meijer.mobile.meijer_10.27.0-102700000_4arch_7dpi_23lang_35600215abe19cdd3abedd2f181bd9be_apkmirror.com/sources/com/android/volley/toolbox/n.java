package com.android.volley.toolbox;

import android.content.Context;
import com.android.volley.toolbox.d;
import java.io.File;

/* loaded from: classes4.dex */
public class n {

    class a implements d.c {

        /* renamed from: a, reason: collision with root package name */
        private File f62988a = null;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f62989b;

        a(Context context) {
            this.f62989b = context;
        }

        @Override // com.android.volley.toolbox.d.c
        public File get() {
            if (this.f62988a == null) {
                this.f62988a = new File(this.f62989b.getCacheDir(), "volley");
            }
            return this.f62988a;
        }
    }

    public static com.android.volley.j a(Context context) {
        return c(context, null);
    }

    public static com.android.volley.j c(Context context, com.android.volley.toolbox.a aVar) {
        return b(context, aVar == null ? new b(new h()) : new b(aVar));
    }

    private static com.android.volley.j b(Context context, com.android.volley.f fVar) {
        com.android.volley.j jVar = new com.android.volley.j(new d(new a(context.getApplicationContext())), fVar);
        jVar.g();
        return jVar;
    }
}
