package c5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import c5.InterfaceC6364j;
import c5.q;
import com.google.android.gms.common.api.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kw.C15328e;
import kw.InterfaceC15330g;
import kw.J;
import kw.w;
import l5.C15376l;
import m5.C15552b;
import m5.Size;
import q5.C16449a;
import q5.C16458j;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0003\u0013\u0019\u0016B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Lc5/e;", "Lc5/j;", "Lc5/q;", "source", "Ll5/l;", "options", "LAv/h;", "parallelismLock", "Lc5/m;", "exifOrientationPolicy", "<init>", "(Lc5/q;Ll5/l;LAv/h;Lc5/m;)V", "Landroid/graphics/BitmapFactory$Options;", "Lc5/h;", "e", "(Landroid/graphics/BitmapFactory$Options;)Lc5/h;", "Lc5/k;", "exifData", "", "c", "(Landroid/graphics/BitmapFactory$Options;Lc5/k;)V", "d", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lc5/q;", "b", "Ll5/l;", "LAv/h;", "Lc5/m;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: c5.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6359e implements InterfaceC6364j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q source;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15376l options;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Av.h parallelismLock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m exifOrientationPolicy;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR4\u0010\u0012\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lc5/e$b;", "Lkw/o;", "Lkw/J;", "delegate", "<init>", "(Lkw/J;)V", "Lkw/e;", "sink", "", "byteCount", "read", "(Lkw/e;J)J", "Ljava/lang/Exception;", "Lkotlin/Exception;", "value", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "exception", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: c5.e$b */
    private static final class b extends kw.o {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Exception exception;

        /* renamed from: a, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        public b(J j10) {
            super(j10);
        }

        @Override // kw.o, kw.J
        public long read(C15328e sink, long byteCount) throws Exception {
            try {
                return super.read(sink, byteCount);
            } catch (Exception e10) {
                this.exception = e10;
                throw e10;
            }
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lc5/e$c;", "Lc5/j$a;", "", "maxParallelism", "Lc5/m;", "exifOrientationPolicy", "<init>", "(ILc5/m;)V", "Lf5/m;", "result", "Ll5/l;", "options", "LZ4/h;", "imageLoader", "Lc5/j;", "a", "(Lf5/m;Ll5/l;LZ4/h;)Lc5/j;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lc5/m;", "LAv/h;", "b", "LAv/h;", "parallelismLock", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: c5.e$c */
    public static final class c implements InterfaceC6364j.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final m exifOrientationPolicy;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Av.h parallelismLock;

        @Override // c5.InterfaceC6364j.a
        public InterfaceC6364j a(f5.m result, C15376l options, Z4.h imageLoader) {
            return new C6359e(result.getSource(), options, this.parallelismLock, this.exifOrientationPolicy);
        }

        public boolean equals(Object other) {
            return other instanceof c;
        }

        public int hashCode() {
            return c.class.hashCode();
        }

        public c(int i10, m mVar) {
            this.exifOrientationPolicy = mVar;
            this.parallelismLock = Av.l.b(i10, 0, 2, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {231, 46}, m = "decode")
    /* renamed from: c5.e$d */
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f61472a;

        /* renamed from: b, reason: collision with root package name */
        Object f61473b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f61474c;

        /* renamed from: e, reason: collision with root package name */
        int f61476e;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f61474c = obj;
            this.f61476e |= Integer.MIN_VALUE;
            return C6359e.this.a(this);
        }
    }

    private final void c(BitmapFactory.Options options, C6365k c6365k) {
        Bitmap.Config config = this.options.getConfig();
        if (c6365k.getIsFlipped() || o.a(c6365k)) {
            config = C16449a.e(config);
        }
        if (this.options.getAllowRgb565() && config == Bitmap.Config.ARGB_8888 && Intrinsics.e(options.outMimeType, "image/jpeg")) {
            config = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && config != Bitmap.Config.HARDWARE) {
            config = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = config;
    }

    private final void d(BitmapFactory.Options options, C6365k c6365k) {
        q.a metadata = this.source.getMetadata();
        if ((metadata instanceof u) && C15552b.a(this.options.getSize())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((u) metadata).getDensity();
            options.inTargetDensity = this.options.getContext().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i10 = o.b(c6365k) ? options.outHeight : options.outWidth;
        int i11 = o.b(c6365k) ? options.outWidth : options.outHeight;
        Size size = this.options.getSize();
        int iB = C15552b.a(size) ? i10 : C16458j.B(size.getWidth(), this.options.getScale());
        Size size2 = this.options.getSize();
        int iB2 = C15552b.a(size2) ? i11 : C16458j.B(size2.getHeight(), this.options.getScale());
        int iA = C6363i.a(i10, i11, iB, iB2, this.options.getScale());
        options.inSampleSize = iA;
        double dB = C6363i.b(i10 / iA, i11 / iA, iB, iB2, this.options.getScale());
        if (this.options.getAllowInexactSize()) {
            dB = RangesKt.i(dB, 1.0d);
        }
        boolean z10 = dB == 1.0d;
        options.inScaled = !z10;
        if (z10) {
            return;
        }
        if (dB > 1.0d) {
            options.inDensity = MathKt.c(a.e.API_PRIORITY_OTHER / dB);
            options.inTargetDensity = a.e.API_PRIORITY_OTHER;
        } else {
            options.inDensity = a.e.API_PRIORITY_OTHER;
            options.inTargetDensity = MathKt.c(a.e.API_PRIORITY_OTHER * dB);
        }
    }

    private final C6362h e(BitmapFactory.Options options) throws Exception {
        b bVar = new b(this.source.b());
        InterfaceC15330g interfaceC15330gD = w.d(bVar);
        boolean z10 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(interfaceC15330gD.peek().T3(), null, options);
        Exception exception = bVar.getException();
        if (exception != null) {
            throw exception;
        }
        options.inJustDecodeBounds = false;
        n nVar = n.f61498a;
        C6365k c6365kA = nVar.a(options.outMimeType, interfaceC15330gD, this.exifOrientationPolicy);
        Exception exception2 = bVar.getException();
        if (exception2 != null) {
            throw exception2;
        }
        options.inMutable = false;
        if (Build.VERSION.SDK_INT >= 26 && this.options.getColorSpace() != null) {
            options.inPreferredColorSpace = this.options.getColorSpace();
        }
        options.inPremultiplied = this.options.getPremultipliedAlpha();
        c(options, c6365kA);
        d(options, c6365kA);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(interfaceC15330gD.T3(), null, options);
            CloseableKt.a(interfaceC15330gD, null);
            Exception exception3 = bVar.getException();
            if (exception3 != null) {
                throw exception3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(this.options.getContext().getResources().getDisplayMetrics().densityDpi);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.options.getContext().getResources(), nVar.b(bitmapDecodeStream, c6365kA));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z10 = false;
            }
            return new C6362h(bitmapDrawable, z10);
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6362h f(C6359e c6359e) {
        return c6359e.e(new BitmapFactory.Options());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // c5.InterfaceC6364j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation<? super c5.C6362h> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof c5.C6359e.d
            if (r0 == 0) goto L13
            r0 = r8
            c5.e$d r0 = (c5.C6359e.d) r0
            int r1 = r0.f61476e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61476e = r1
            goto L18
        L13:
            c5.e$d r0 = new c5.e$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f61474c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f61476e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.f61472a
            Av.h r0 = (Av.h) r0
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L70
        L30:
            r8 = move-exception
            goto L7a
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            java.lang.Object r2 = r0.f61473b
            Av.h r2 = (Av.h) r2
            java.lang.Object r5 = r0.f61472a
            c5.e r5 = (c5.C6359e) r5
            kotlin.ResultKt.b(r8)
            r8 = r2
            goto L5a
        L47:
            kotlin.ResultKt.b(r8)
            Av.h r8 = r7.parallelismLock
            r0.f61472a = r7
            r0.f61473b = r8
            r0.f61476e = r4
            java.lang.Object r2 = r8.d(r0)
            if (r2 != r1) goto L59
            goto L6c
        L59:
            r5 = r7
        L5a:
            c5.d r2 = new c5.d     // Catch: java.lang.Throwable -> L76
            r2.<init>()     // Catch: java.lang.Throwable -> L76
            r0.f61472a = r8     // Catch: java.lang.Throwable -> L76
            r5 = 0
            r0.f61473b = r5     // Catch: java.lang.Throwable -> L76
            r0.f61476e = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = qv.C16679z0.c(r5, r2, r0, r4, r5)     // Catch: java.lang.Throwable -> L76
            if (r0 != r1) goto L6d
        L6c:
            return r1
        L6d:
            r6 = r0
            r0 = r8
            r8 = r6
        L70:
            c5.h r8 = (c5.C6362h) r8     // Catch: java.lang.Throwable -> L30
            r0.release()
            return r8
        L76:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L7a:
            r0.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.C6359e.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public C6359e(q qVar, C15376l c15376l, Av.h hVar, m mVar) {
        this.source = qVar;
        this.options = c15376l;
        this.parallelismLock = hVar;
        this.exifOrientationPolicy = mVar;
    }
}
