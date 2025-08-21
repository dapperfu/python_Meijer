package k2;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import androidx.collection.LruCache;
import b2.C6324e;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import k2.g;

/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private static final LruCache<c, ProviderInfo> f141357a = new LruCache<>(2);

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator<byte[]> f141358b = new Comparator() { // from class: k2.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.a((byte[]) obj, (byte[]) obj2);
        }
    };

    private interface a {
        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();

        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }
    }

    private static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final ContentProviderClient f141359a;

        @Override // k2.d.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f141359a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e10) {
                FS.log_w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        @Override // k2.d.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f141359a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }

        b(Context context, Uri uri) {
            this.f141359a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        String f141360a;

        /* renamed from: b, reason: collision with root package name */
        String f141361b;

        /* renamed from: c, reason: collision with root package name */
        List<List<byte[]>> f141362c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f141360a, cVar.f141360a) && Objects.equals(this.f141361b, cVar.f141361b) && Objects.equals(this.f141362c, cVar.f141362c);
        }

        public int hashCode() {
            return Objects.hash(this.f141360a, this.f141361b, this.f141362c);
        }

        c(String str, String str2, List<List<byte[]>> list) {
            this.f141360a = str;
            this.f141361b = str2;
            this.f141362c = list;
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    private static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    static g.a e(Context context, List<e> list, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        H4.a.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                e eVar = list.get(i10);
                ProviderInfo providerInfoF = f(context.getPackageManager(), eVar, context.getResources());
                if (providerInfoF == null) {
                    return g.a.b(1, null);
                }
                arrayList.add(g(context, eVar, providerInfoF.authority, cancellationSignal));
            }
            return g.a.a(0, arrayList);
        } finally {
            H4.a.f();
        }
    }

    static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) throws PackageManager.NameNotFoundException {
        H4.a.c("FontProvider.getProvider");
        try {
            List<List<byte[]>> listD = d(eVar, resources);
            c cVar = new c(eVar.e(), eVar.f(), listD);
            ProviderInfo providerInfoD = f141357a.d(cVar);
            if (providerInfoD != null) {
                return providerInfoD;
            }
            String strE = eVar.e();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(eVar.f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + eVar.f());
            }
            List<byte[]> listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listB, f141358b);
            for (int i10 = 0; i10 < listD.size(); i10++) {
                ArrayList arrayList = new ArrayList(listD.get(i10));
                Collections.sort(arrayList, f141358b);
                if (c(listB, arrayList)) {
                    f141357a.f(cVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            H4.a.f();
            return null;
        } finally {
            H4.a.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v2, types: [k2.d$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static k2.g.b[] g(android.content.Context r16, k2.e r17, java.lang.String r18, android.os.CancellationSignal r19) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.d.g(android.content.Context, k2.e, java.lang.String, android.os.CancellationSignal):k2.g$b[]");
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> d(e eVar, Resources resources) {
        if (eVar.b() != null) {
            return eVar.b();
        }
        return C6324e.c(resources, eVar.c());
    }
}
