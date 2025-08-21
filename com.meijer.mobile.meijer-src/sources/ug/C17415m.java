package ug;

import Ed.AbstractC3191f;
import Ed.AbstractC3194i;
import Ed.C3193h;
import Vd.C5519m;
import Vd.InterfaceC5512f;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.fullstory.FS;
import com.google.android.gms.dynamite.DynamiteModule;
import id.C14720c;
import id.C14724g;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import od.C16106b;
import od.C16107c;
import od.C16110f;

/* renamed from: ug.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C17415m {

    /* renamed from: A, reason: collision with root package name */
    private static final AbstractC3194i f163962A;

    /* renamed from: B, reason: collision with root package name */
    private static final AbstractC3194i f163963B;

    /* renamed from: a, reason: collision with root package name */
    public static final C14720c[] f163964a = new C14720c[0];

    /* renamed from: b, reason: collision with root package name */
    public static final C14720c f163965b;

    /* renamed from: c, reason: collision with root package name */
    public static final C14720c f163966c;

    /* renamed from: d, reason: collision with root package name */
    public static final C14720c f163967d;

    /* renamed from: e, reason: collision with root package name */
    public static final C14720c f163968e;

    /* renamed from: f, reason: collision with root package name */
    public static final C14720c f163969f;

    /* renamed from: g, reason: collision with root package name */
    public static final C14720c f163970g;

    /* renamed from: h, reason: collision with root package name */
    public static final C14720c f163971h;

    /* renamed from: i, reason: collision with root package name */
    public static final C14720c f163972i;

    /* renamed from: j, reason: collision with root package name */
    public static final C14720c f163973j;

    /* renamed from: k, reason: collision with root package name */
    public static final C14720c f163974k;

    /* renamed from: l, reason: collision with root package name */
    public static final C14720c f163975l;

    /* renamed from: m, reason: collision with root package name */
    public static final C14720c f163976m;

    /* renamed from: n, reason: collision with root package name */
    public static final C14720c f163977n;

    /* renamed from: o, reason: collision with root package name */
    public static final C14720c f163978o;

    /* renamed from: p, reason: collision with root package name */
    public static final C14720c f163979p;

    /* renamed from: q, reason: collision with root package name */
    public static final C14720c f163980q;

    /* renamed from: r, reason: collision with root package name */
    public static final C14720c f163981r;

    /* renamed from: s, reason: collision with root package name */
    public static final C14720c f163982s;

    /* renamed from: t, reason: collision with root package name */
    public static final C14720c f163983t;

    /* renamed from: u, reason: collision with root package name */
    public static final C14720c f163984u;

    /* renamed from: v, reason: collision with root package name */
    public static final C14720c f163985v;

    /* renamed from: w, reason: collision with root package name */
    public static final C14720c f163986w;

    /* renamed from: x, reason: collision with root package name */
    public static final C14720c f163987x;

    /* renamed from: y, reason: collision with root package name */
    public static final C14720c f163988y;

    /* renamed from: z, reason: collision with root package name */
    public static final C14720c f163989z;

    static {
        C14720c c14720c = new C14720c("vision.barcode", 1L);
        f163965b = c14720c;
        C14720c c14720c2 = new C14720c("vision.custom.ica", 1L);
        f163966c = c14720c2;
        C14720c c14720c3 = new C14720c("vision.face", 1L);
        f163967d = c14720c3;
        C14720c c14720c4 = new C14720c("vision.ica", 1L);
        f163968e = c14720c4;
        C14720c c14720c5 = new C14720c("vision.ocr", 1L);
        f163969f = c14720c5;
        f163970g = new C14720c("mlkit.ocr.chinese", 1L);
        f163971h = new C14720c("mlkit.ocr.common", 1L);
        f163972i = new C14720c("mlkit.ocr.devanagari", 1L);
        f163973j = new C14720c("mlkit.ocr.japanese", 1L);
        f163974k = new C14720c("mlkit.ocr.korean", 1L);
        C14720c c14720c6 = new C14720c("mlkit.langid", 1L);
        f163975l = c14720c6;
        C14720c c14720c7 = new C14720c("mlkit.nlclassifier", 1L);
        f163976m = c14720c7;
        C14720c c14720c8 = new C14720c("tflite_dynamite", 1L);
        f163977n = c14720c8;
        C14720c c14720c9 = new C14720c("mlkit.barcode.ui", 1L);
        f163978o = c14720c9;
        C14720c c14720c10 = new C14720c("mlkit.smartreply", 1L);
        f163979p = c14720c10;
        f163980q = new C14720c("mlkit.image.caption", 1L);
        f163981r = new C14720c("mlkit.docscan.detect", 1L);
        f163982s = new C14720c("mlkit.docscan.crop", 1L);
        f163983t = new C14720c("mlkit.docscan.enhance", 1L);
        f163984u = new C14720c("mlkit.docscan.ui", 1L);
        f163985v = new C14720c("mlkit.docscan.stain", 1L);
        f163986w = new C14720c("mlkit.docscan.shadow", 1L);
        f163987x = new C14720c("mlkit.quality.aesthetic", 1L);
        f163988y = new C14720c("mlkit.quality.technical", 1L);
        f163989z = new C14720c("mlkit.segmentation.subject", 1L);
        C3193h c3193h = new C3193h();
        c3193h.a("barcode", c14720c);
        c3193h.a("custom_ica", c14720c2);
        c3193h.a("face", c14720c3);
        c3193h.a("ica", c14720c4);
        c3193h.a("ocr", c14720c5);
        c3193h.a("langid", c14720c6);
        c3193h.a("nlclassifier", c14720c7);
        c3193h.a("tflite_dynamite", c14720c8);
        c3193h.a("barcode_ui", c14720c9);
        c3193h.a("smart_reply", c14720c10);
        f163962A = c3193h.b();
        C3193h c3193h2 = new C3193h();
        c3193h2.a("com.google.android.gms.vision.barcode", c14720c);
        c3193h2.a("com.google.android.gms.vision.custom.ica", c14720c2);
        c3193h2.a("com.google.android.gms.vision.face", c14720c3);
        c3193h2.a("com.google.android.gms.vision.ica", c14720c4);
        c3193h2.a("com.google.android.gms.vision.ocr", c14720c5);
        c3193h2.a("com.google.android.gms.mlkit.langid", c14720c6);
        c3193h2.a("com.google.android.gms.mlkit.nlclassifier", c14720c7);
        c3193h2.a("com.google.android.gms.tflite_dynamite", c14720c8);
        c3193h2.a("com.google.android.gms.mlkit_smartreply", c14720c10);
        f163963B = c3193h2.b();
    }

    public static boolean b(Context context, final C14720c[] c14720cArr) {
        try {
            return ((C16106b) C5519m.a(C16107c.a(context).n(new com.google.android.gms.common.api.f() { // from class: ug.D
                @Override // com.google.android.gms.common.api.f
                public final C14720c[] a() {
                    C14720c[] c14720cArr2 = C17415m.f163964a;
                    return c14720cArr;
                }
            }).e(new InterfaceC5512f() { // from class: ug.E
                @Override // Vd.InterfaceC5512f
                public final void onFailure(Exception exc) {
                    FS.log_e("OptionalModuleUtils", "Failed to check feature availability", exc);
                }
            }))).B();
        } catch (InterruptedException | ExecutionException e10) {
            FS.log_e("OptionalModuleUtils", "Failed to complete the task of features availability check", e10);
            return false;
        }
    }

    @Deprecated
    public static boolean a(Context context, List<String> list) throws Throwable {
        if (C14724g.f().a(context) >= 221500000) {
            return b(context, f(f163963B, list));
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                DynamiteModule.e(context, DynamiteModule.f65836b, it.next());
            }
            return true;
        } catch (DynamiteModule.LoadingException unused) {
            return false;
        }
    }

    @Deprecated
    public static void c(Context context, String str) {
        d(context, AbstractC3191f.m(str));
    }

    @Deprecated
    public static void d(Context context, List<String> list) {
        if (C14724g.f().a(context) >= 221500000) {
            e(context, f(f163962A, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void e(Context context, final C14720c[] c14720cArr) {
        C16107c.a(context).j(C16110f.d().a(new com.google.android.gms.common.api.f() { // from class: ug.B
            @Override // com.google.android.gms.common.api.f
            public final C14720c[] a() {
                C14720c[] c14720cArr2 = C17415m.f163964a;
                return c14720cArr;
            }
        }).b()).e(new InterfaceC5512f() { // from class: ug.C
            @Override // Vd.InterfaceC5512f
            public final void onFailure(Exception exc) {
                FS.log_e("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }

    private static C14720c[] f(Map map, List list) {
        C14720c[] c14720cArr = new C14720c[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            c14720cArr[i10] = (C14720c) com.google.android.gms.common.internal.r.l((C14720c) map.get(list.get(i10)));
        }
        return c14720cArr;
    }
}
