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
public final class C9194qf {

    /* renamed from: d, reason: collision with root package name */
    String f77821d;

    /* renamed from: e, reason: collision with root package name */
    Context f77822e;

    /* renamed from: f, reason: collision with root package name */
    String f77823f;

    /* renamed from: h, reason: collision with root package name */
    private AtomicBoolean f77825h;

    /* renamed from: i, reason: collision with root package name */
    private File f77826i;

    /* renamed from: a, reason: collision with root package name */
    final BlockingQueue f77818a = new ArrayBlockingQueue(100);

    /* renamed from: b, reason: collision with root package name */
    final LinkedHashMap f77819b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map f77820c = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final HashSet f77824g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void c(C9194qf c9194qf) throws Throwable {
        while (true) {
            try {
                C6554Af c6554Af = (C6554Af) c9194qf.f77818a.take();
                C10156zf c10156zfA = c6554Af.a();
                if (!TextUtils.isEmpty(c10156zfA.b())) {
                    c9194qf.g(c9194qf.b(c9194qf.f77819b, c6554Af.b()), c10156zfA);
                }
            } catch (InterruptedException e10) {
                Qc.p.h("CsiReporter:reporter interrupted", e10);
                return;
            }
        }
    }

    private final void g(Map map, C10156zf c10156zf) throws Throwable {
        FileOutputStream fileOutputStream;
        Uri.Builder builderBuildUpon = Uri.parse(this.f77821d).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (c10156zf != null) {
            StringBuilder sb2 = new StringBuilder(string);
            if (!TextUtils.isEmpty(c10156zf.b())) {
                sb2.append("&it=");
                sb2.append(c10156zf.b());
            }
            if (!TextUtils.isEmpty(c10156zf.a())) {
                sb2.append("&blat=");
                sb2.append(c10156zf.a());
            }
            string = sb2.toString();
        }
        if (!this.f77825h.get()) {
            Lc.v.t();
            Pc.D0.m(this.f77822e, this.f77823f, string);
            return;
        }
        File file = this.f77826i;
        if (file == null) {
            Qc.p.g("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
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
                Qc.p.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
            }
        } catch (IOException e12) {
            e = e12;
            fileOutputStream2 = fileOutputStream;
            Qc.p.h("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e13) {
                    Qc.p.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e13);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e14) {
                    Qc.p.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e14);
                }
            }
            throw th;
        }
    }

    public final AbstractC9835wf a(String str) {
        AbstractC9835wf abstractC9835wf = (AbstractC9835wf) this.f77820c.get(str);
        return abstractC9835wf != null ? abstractC9835wf : AbstractC9835wf.f79511a;
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
        this.f77822e = context;
        this.f77823f = str;
        this.f77821d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f77825h = atomicBoolean;
        atomicBoolean.set(((Boolean) C8235hg.f74765c.e()).booleanValue());
        if (this.f77825h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f77826i = new File(C8977od0.a(C8870nd0.a(), externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f77819b.put((String) entry.getKey(), (String) entry.getValue());
        }
        C6908Kq.f68174a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.pf
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C9194qf.c(this.f77620a);
            }
        });
        Map map2 = this.f77820c;
        AbstractC9835wf abstractC9835wf = AbstractC9835wf.f79512b;
        map2.put("action", abstractC9835wf);
        this.f77820c.put("ad_format", abstractC9835wf);
        this.f77820c.put("e", AbstractC9835wf.f79513c);
    }

    public final void e(String str) throws Throwable {
        if (this.f77824g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f77823f);
        linkedHashMap.put("ue", str);
        g(b(this.f77819b, linkedHashMap), null);
    }

    public final boolean f(C6554Af c6554Af) {
        return this.f77818a.offer(c6554Af);
    }
}
