package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.qf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9319qf {

    /* renamed from: d, reason: collision with root package name */
    String f78661d;

    /* renamed from: e, reason: collision with root package name */
    Context f78662e;

    /* renamed from: f, reason: collision with root package name */
    String f78663f;

    /* renamed from: h, reason: collision with root package name */
    private AtomicBoolean f78665h;

    /* renamed from: i, reason: collision with root package name */
    private File f78666i;

    /* renamed from: a, reason: collision with root package name */
    final BlockingQueue f78658a = new ArrayBlockingQueue(100);

    /* renamed from: b, reason: collision with root package name */
    final LinkedHashMap f78659b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map f78660c = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final HashSet f78664g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void c(C9319qf c9319qf) throws Throwable {
        while (true) {
            try {
                C6679Af c6679Af = (C6679Af) c9319qf.f78658a.take();
                C10281zf c10281zfA = c6679Af.a();
                if (!TextUtils.isEmpty(c10281zfA.b())) {
                    c9319qf.g(c9319qf.b(c9319qf.f78659b, c6679Af.b()), c10281zfA);
                }
            } catch (InterruptedException e10) {
                Sc.p.h("CsiReporter:reporter interrupted", e10);
                return;
            }
        }
    }

    private final void g(Map map, C10281zf c10281zf) throws Throwable {
        FileOutputStream fileOutputStream;
        Uri.Builder builderBuildUpon = Uri.parse(this.f78661d).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (c10281zf != null) {
            StringBuilder sb2 = new StringBuilder(string);
            if (!TextUtils.isEmpty(c10281zf.b())) {
                sb2.append("&it=");
                sb2.append(c10281zf.b());
            }
            if (!TextUtils.isEmpty(c10281zf.a())) {
                sb2.append("&blat=");
                sb2.append(c10281zf.a());
            }
            string = sb2.toString();
        }
        if (!this.f78665h.get()) {
            Nc.v.t();
            Rc.D0.m(this.f78662e, this.f78663f, string);
            return;
        }
        File file = this.f78666i;
        if (file == null) {
            Sc.p.g("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            fileOutputStream.write(string.getBytes());
            fileOutputStream.write(10);
            try {
                fileOutputStream.close();
            } catch (IOException e11) {
                Sc.p.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
            }
        } catch (IOException e12) {
            e = e12;
            fileOutputStream2 = fileOutputStream;
            Sc.p.h("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e13) {
                    Sc.p.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e13);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e14) {
                    Sc.p.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e14);
                }
            }
            throw th;
        }
    }

    public final AbstractC9960wf a(String str) {
        AbstractC9960wf abstractC9960wf = (AbstractC9960wf) this.f78660c.get(str);
        return abstractC9960wf != null ? abstractC9960wf : AbstractC9960wf.f80351a;
    }

    final Map b(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, a(str).a((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final void d(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.f78662e = context;
        this.f78663f = str;
        this.f78661d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f78665h = atomicBoolean;
        atomicBoolean.set(((Boolean) C8360hg.f75605c.e()).booleanValue());
        if (this.f78665h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f78666i = new File(C9102od0.a(C8995nd0.a(), externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f78659b.put((String) entry.getKey(), (String) entry.getValue());
        }
        C7033Kq.f69014a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.pf
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C9319qf.c(this.f78460a);
            }
        });
        Map map2 = this.f78660c;
        AbstractC9960wf abstractC9960wf = AbstractC9960wf.f80352b;
        map2.put("action", abstractC9960wf);
        this.f78660c.put("ad_format", abstractC9960wf);
        this.f78660c.put("e", AbstractC9960wf.f80353c);
    }

    public final void e(String str) throws Throwable {
        if (this.f78664g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f78663f);
        linkedHashMap.put("ue", str);
        g(b(this.f78659b, linkedHashMap), null);
    }

    public final boolean f(C6679Af c6679Af) {
        return this.f78658a.offer(c6679Af);
    }
}
