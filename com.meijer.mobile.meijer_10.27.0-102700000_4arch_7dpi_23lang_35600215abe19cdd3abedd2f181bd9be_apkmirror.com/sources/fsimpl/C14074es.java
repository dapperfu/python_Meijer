package fsimpl;

import com.fullstory.util.Log;
import java.io.File;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: fsimpl.es, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C14074es implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    final eE f132183a;

    /* renamed from: b, reason: collision with root package name */
    File f132184b;

    /* renamed from: c, reason: collision with root package name */
    File f132185c;

    /* renamed from: d, reason: collision with root package name */
    FileChannel f132186d;

    /* renamed from: e, reason: collision with root package name */
    FileLock f132187e;

    /* renamed from: f, reason: collision with root package name */
    String f132188f;

    /* renamed from: g, reason: collision with root package name */
    long f132189g;

    /* renamed from: h, reason: collision with root package name */
    long f132190h;

    /* renamed from: i, reason: collision with root package name */
    eC f132191i;

    /* renamed from: j, reason: collision with root package name */
    URL f132192j;

    /* renamed from: k, reason: collision with root package name */
    String f132193k;

    /* renamed from: l, reason: collision with root package name */
    boolean f132194l;

    /* renamed from: m, reason: collision with root package name */
    boolean f132195m;

    /* renamed from: n, reason: collision with root package name */
    String f132196n;

    public C14074es(eE eEVar) {
        this.f132183a = eEVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14074es c14074es) {
        if (c14074es == null) {
            throw new IllegalArgumentException("Null comparable");
        }
        int iCompareTo = this.f132183a.compareTo(c14074es.f132183a);
        if (iCompareTo != 0) {
            return -iCompareTo;
        }
        int iCompareTo2 = this.f132191i.compareTo(c14074es.f132191i);
        if (iCompareTo2 != 0) {
            return -iCompareTo2;
        }
        int i10 = (this.f132189g > c14074es.f132189g ? 1 : (this.f132189g == c14074es.f132189g ? 0 : -1));
        return i10 != 0 ? i10 : this.f132188f.compareTo(c14074es.f132188f);
    }

    void a() {
        b();
        if (!this.f132184b.delete()) {
            Log.e("Unexpectedly unable to delete " + this.f132184b.getAbsolutePath());
        }
        if (this.f132185c.delete()) {
            return;
        }
        Log.e("Unexpectedly unable to delete " + this.f132185c.getAbsolutePath());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016 A[Catch: all -> 0x001d, TryCatch #1 {, blocks: (B:3:0x0001, B:6:0x0006, B:10:0x0010, B:11:0x0012, B:13:0x0016, B:14:0x001b, B:9:0x000b), top: B:21:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void b() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.nio.channels.FileLock r0 = r3.f132187e     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            if (r0 == 0) goto L12
            r0.release()     // Catch: java.io.IOException -> La java.lang.Throwable -> L1d
            goto L10
        La:
            r0 = move-exception
            java.lang.String r2 = "Unexpectedly couldn't release file lock"
            com.fullstory.util.Log.e(r2, r0)     // Catch: java.lang.Throwable -> L1d
        L10:
            r3.f132187e = r1     // Catch: java.lang.Throwable -> L1d
        L12:
            java.nio.channels.FileChannel r0 = r3.f132186d     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1b
            fsimpl.fG.a(r0)     // Catch: java.lang.Throwable -> L1d
            r3.f132186d = r1     // Catch: java.lang.Throwable -> L1d
        L1b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.C14074es.b():void");
    }
}
