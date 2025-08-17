package ku;

import java.io.PrintWriter;

/* renamed from: ku.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C15322b {

    /* renamed from: a, reason: collision with root package name */
    public final int f148007a;

    /* renamed from: b, reason: collision with root package name */
    public final int f148008b;

    /* renamed from: c, reason: collision with root package name */
    public final long f148009c;

    /* renamed from: d, reason: collision with root package name */
    public final long f148010d;

    /* renamed from: e, reason: collision with root package name */
    public final long f148011e;

    /* renamed from: f, reason: collision with root package name */
    public final long f148012f;

    /* renamed from: g, reason: collision with root package name */
    public final long f148013g;

    /* renamed from: h, reason: collision with root package name */
    public final long f148014h;

    /* renamed from: i, reason: collision with root package name */
    public final long f148015i;

    /* renamed from: j, reason: collision with root package name */
    public final long f148016j;

    /* renamed from: k, reason: collision with root package name */
    public final int f148017k;

    /* renamed from: l, reason: collision with root package name */
    public final int f148018l;

    /* renamed from: m, reason: collision with root package name */
    public final int f148019m;

    /* renamed from: n, reason: collision with root package name */
    public final long f148020n;

    public void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f148007a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f148008b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f148008b / this.f148007a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f148009c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f148010d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f148017k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f148011e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f148014h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f148018l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f148012f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f148019m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f148013g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f148015i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f148016j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f148007a + ", size=" + this.f148008b + ", cacheHits=" + this.f148009c + ", cacheMisses=" + this.f148010d + ", downloadCount=" + this.f148017k + ", totalDownloadSize=" + this.f148011e + ", averageDownloadSize=" + this.f148014h + ", totalOriginalBitmapSize=" + this.f148012f + ", totalTransformedBitmapSize=" + this.f148013g + ", averageOriginalBitmapSize=" + this.f148015i + ", averageTransformedBitmapSize=" + this.f148016j + ", originalBitmapCount=" + this.f148018l + ", transformedBitmapCount=" + this.f148019m + ", timeStamp=" + this.f148020n + '}';
    }

    public C15322b(int i10, int i11, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i12, int i13, int i14, long j18) {
        this.f148007a = i10;
        this.f148008b = i11;
        this.f148009c = j10;
        this.f148010d = j11;
        this.f148011e = j12;
        this.f148012f = j13;
        this.f148013g = j14;
        this.f148014h = j15;
        this.f148015i = j16;
        this.f148016j = j17;
        this.f148017k = i12;
        this.f148018l = i13;
        this.f148019m = i14;
        this.f148020n = j18;
    }
}
