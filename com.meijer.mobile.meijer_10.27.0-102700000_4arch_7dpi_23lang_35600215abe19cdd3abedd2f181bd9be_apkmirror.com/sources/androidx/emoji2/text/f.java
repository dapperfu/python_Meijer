package androidx.emoji2.text;

import Z.C5504b;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class f {

    /* renamed from: o, reason: collision with root package name */
    private static final Object f54573o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static final Object f54574p = new Object();

    /* renamed from: q, reason: collision with root package name */
    private static volatile f f54575q;

    /* renamed from: b, reason: collision with root package name */
    private final Set<AbstractC1107f> f54577b;

    /* renamed from: e, reason: collision with root package name */
    private final b f54580e;

    /* renamed from: f, reason: collision with root package name */
    final h f54581f;

    /* renamed from: g, reason: collision with root package name */
    private final j f54582g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f54583h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f54584i;

    /* renamed from: j, reason: collision with root package name */
    final int[] f54585j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f54586k;

    /* renamed from: l, reason: collision with root package name */
    private final int f54587l;

    /* renamed from: m, reason: collision with root package name */
    private final int f54588m;

    /* renamed from: n, reason: collision with root package name */
    private final e f54589n;

    /* renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f54576a = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f54578c = 3;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f54579d = new Handler(Looper.getMainLooper());

    private static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.i f54590b;

        /* renamed from: c, reason: collision with root package name */
        private volatile n f54591c;

        /* renamed from: androidx.emoji2.text.f$a$a, reason: collision with other inner class name */
        class C1106a extends i {
            C1106a() {
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th2) {
                a.this.f54593a.p(th2);
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                a.this.f(nVar);
            }
        }

        @Override // androidx.emoji2.text.f.b
        int a(CharSequence charSequence, int i10) {
            return this.f54590b.b(charSequence, i10);
        }

        @Override // androidx.emoji2.text.f.b
        int b(CharSequence charSequence, int i10) {
            return this.f54590b.c(charSequence, i10);
        }

        @Override // androidx.emoji2.text.f.b
        void c() {
            try {
                this.f54593a.f54581f.a(new C1106a());
            } catch (Throwable th2) {
                this.f54593a.p(th2);
            }
        }

        @Override // androidx.emoji2.text.f.b
        CharSequence d(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f54590b.j(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.f.b
        void e(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f54591c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f54593a.f54583h);
        }

        void f(n nVar) {
            if (nVar == null) {
                this.f54593a.p(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f54591c = nVar;
            n nVar2 = this.f54591c;
            j jVar = this.f54593a.f54582g;
            e eVar = this.f54593a.f54589n;
            f fVar = this.f54593a;
            this.f54590b = new androidx.emoji2.text.i(nVar2, jVar, eVar, fVar.f54584i, fVar.f54585j, androidx.emoji2.text.h.a());
            this.f54593a.q();
        }

        a(f fVar) {
            super(fVar);
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final h f54594a;

        /* renamed from: b, reason: collision with root package name */
        j f54595b;

        /* renamed from: c, reason: collision with root package name */
        boolean f54596c;

        /* renamed from: d, reason: collision with root package name */
        boolean f54597d;

        /* renamed from: e, reason: collision with root package name */
        int[] f54598e;

        /* renamed from: f, reason: collision with root package name */
        Set<AbstractC1107f> f54599f;

        /* renamed from: g, reason: collision with root package name */
        boolean f54600g;

        /* renamed from: h, reason: collision with root package name */
        int f54601h = -16711936;

        /* renamed from: i, reason: collision with root package name */
        int f54602i = 0;

        /* renamed from: j, reason: collision with root package name */
        e f54603j = new androidx.emoji2.text.e();

        protected final h a() {
            return this.f54594a;
        }

        public c b(int i10) {
            this.f54602i = i10;
            return this;
        }

        protected c(h hVar) {
            o2.i.h(hVar, "metadataLoader cannot be null.");
            this.f54594a = hVar;
        }
    }

    public static class d implements j {
        @Override // androidx.emoji2.text.f.j
        public androidx.emoji2.text.j a(p pVar) {
            return new q(pVar);
        }
    }

    public interface e {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* renamed from: androidx.emoji2.text.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC1107f {
        public void a(Throwable th2) {
        }

        public void b() {
        }
    }

    private static class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<AbstractC1107f> f54604a;

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f54605b;

        /* renamed from: c, reason: collision with root package name */
        private final int f54606c;

        g(AbstractC1107f abstractC1107f, int i10) {
            this(Arrays.asList((AbstractC1107f) o2.i.h(abstractC1107f, "initCallback cannot be null")), i10, null);
        }

        g(Collection<AbstractC1107f> collection, int i10) {
            this(collection, i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f54604a.size();
            int i10 = 0;
            if (this.f54606c != 1) {
                while (i10 < size) {
                    this.f54604a.get(i10).a(this.f54605b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    this.f54604a.get(i10).b();
                    i10++;
                }
            }
        }

        g(Collection<AbstractC1107f> collection, int i10, Throwable th2) {
            o2.i.h(collection, "initCallbacks cannot be null");
            this.f54604a = new ArrayList(collection);
            this.f54606c = i10;
            this.f54605b = th2;
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th2);

        public abstract void b(n nVar);
    }

    public interface j {
        androidx.emoji2.text.j a(p pVar);
    }

    public CharSequence r(CharSequence charSequence) {
        return s(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence t(CharSequence charSequence, int i10, int i11, int i12) {
        return u(charSequence, i10, i11, i12, 0);
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final f f54593a;

        int a(CharSequence charSequence, int i10) {
            throw null;
        }

        int b(CharSequence charSequence, int i10) {
            throw null;
        }

        void c() {
            throw null;
        }

        CharSequence d(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            throw null;
        }

        void e(EditorInfo editorInfo) {
            throw null;
        }

        b(f fVar) {
            this.f54593a = fVar;
        }
    }

    public static f c() {
        f fVar;
        synchronized (f54573o) {
            fVar = f54575q;
            o2.i.j(fVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return fVar;
    }

    public static f j(c cVar) {
        f fVar;
        f fVar2 = f54575q;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (f54573o) {
            try {
                fVar = f54575q;
                if (fVar == null) {
                    fVar = new f(cVar);
                    f54575q = fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static boolean k() {
        return f54575q != null;
    }

    private void o() {
        this.f54576a.writeLock().lock();
        try {
            if (this.f54588m == 0) {
                this.f54578c = 0;
            }
            this.f54576a.writeLock().unlock();
            if (g() == 0) {
                this.f54580e.c();
            }
        } catch (Throwable th2) {
            this.f54576a.writeLock().unlock();
            throw th2;
        }
    }

    public int e() {
        return this.f54587l;
    }

    public int g() {
        this.f54576a.readLock().lock();
        try {
            return this.f54578c;
        } finally {
            this.f54576a.readLock().unlock();
        }
    }

    public boolean l() {
        return this.f54586k;
    }

    public void n() {
        o2.i.j(this.f54588m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m()) {
            return;
        }
        this.f54576a.writeLock().lock();
        try {
            if (this.f54578c == 0) {
                return;
            }
            this.f54578c = 0;
            this.f54576a.writeLock().unlock();
            this.f54580e.c();
        } finally {
            this.f54576a.writeLock().unlock();
        }
    }

    void p(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f54576a.writeLock().lock();
        try {
            this.f54578c = 2;
            arrayList.addAll(this.f54577b);
            this.f54577b.clear();
            this.f54576a.writeLock().unlock();
            this.f54579d.post(new g(arrayList, this.f54578c, th2));
        } catch (Throwable th3) {
            this.f54576a.writeLock().unlock();
            throw th3;
        }
    }

    void q() {
        ArrayList arrayList = new ArrayList();
        this.f54576a.writeLock().lock();
        try {
            this.f54578c = 1;
            arrayList.addAll(this.f54577b);
            this.f54577b.clear();
            this.f54576a.writeLock().unlock();
            this.f54579d.post(new g(arrayList, this.f54578c));
        } catch (Throwable th2) {
            this.f54576a.writeLock().unlock();
            throw th2;
        }
    }

    public void v(AbstractC1107f abstractC1107f) {
        o2.i.h(abstractC1107f, "initCallback cannot be null");
        this.f54576a.writeLock().lock();
        try {
            if (this.f54578c == 1 || this.f54578c == 2) {
                this.f54579d.post(new g(abstractC1107f, this.f54578c));
            } else {
                this.f54577b.add(abstractC1107f);
            }
            this.f54576a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f54576a.writeLock().unlock();
            throw th2;
        }
    }

    public void w(AbstractC1107f abstractC1107f) {
        o2.i.h(abstractC1107f, "initCallback cannot be null");
        this.f54576a.writeLock().lock();
        try {
            this.f54577b.remove(abstractC1107f);
        } finally {
            this.f54576a.writeLock().unlock();
        }
    }

    private f(c cVar) {
        this.f54583h = cVar.f54596c;
        this.f54584i = cVar.f54597d;
        this.f54585j = cVar.f54598e;
        this.f54586k = cVar.f54600g;
        this.f54587l = cVar.f54601h;
        this.f54581f = cVar.f54594a;
        this.f54588m = cVar.f54602i;
        this.f54589n = cVar.f54603j;
        C5504b c5504b = new C5504b();
        this.f54577b = c5504b;
        j jVar = cVar.f54595b;
        this.f54582g = jVar == null ? new d() : jVar;
        Set<AbstractC1107f> set = cVar.f54599f;
        if (set != null && !set.isEmpty()) {
            c5504b.addAll(cVar.f54599f);
        }
        this.f54580e = new a(this);
        o();
    }

    public static boolean h(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return androidx.emoji2.text.i.d(inputConnection, editable, i10, i11, z10);
    }

    public static boolean i(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.i.e(editable, i10, keyEvent);
    }

    private boolean m() {
        if (g() == 1) {
            return true;
        }
        return false;
    }

    public int d(CharSequence charSequence, int i10) {
        o2.i.j(m(), "Not initialized yet");
        o2.i.h(charSequence, "charSequence cannot be null");
        return this.f54580e.a(charSequence, i10);
    }

    public int f(CharSequence charSequence, int i10) {
        o2.i.j(m(), "Not initialized yet");
        o2.i.h(charSequence, "charSequence cannot be null");
        return this.f54580e.b(charSequence, i10);
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11) {
        return t(charSequence, i10, i11, a.e.API_PRIORITY_OTHER);
    }

    public CharSequence u(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        o2.i.j(m(), "Not initialized yet");
        o2.i.e(i10, "start cannot be negative");
        o2.i.e(i11, "end cannot be negative");
        o2.i.e(i12, "maxEmojiCount cannot be negative");
        boolean z14 = false;
        if (i10 <= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2.i.b(z10, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        if (i10 <= charSequence.length()) {
            z11 = true;
        } else {
            z11 = false;
        }
        o2.i.b(z11, "start should be < than charSequence length");
        if (i11 <= charSequence.length()) {
            z12 = true;
        } else {
            z12 = false;
        }
        o2.i.b(z12, "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            if (i13 != 2) {
                z14 = this.f54583h;
            }
            z13 = z14;
        } else {
            z13 = true;
        }
        return this.f54580e.d(charSequence, i10, i11, i12, z13);
    }

    public void x(EditorInfo editorInfo) {
        if (m() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f54580e.e(editorInfo);
        }
    }
}
