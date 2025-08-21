package androidx.emoji2.text;

import Z.C5604b;
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
    private static final Object f54797o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static final Object f54798p = new Object();

    /* renamed from: q, reason: collision with root package name */
    private static volatile f f54799q;

    /* renamed from: b, reason: collision with root package name */
    private final Set<AbstractC1120f> f54801b;

    /* renamed from: e, reason: collision with root package name */
    private final b f54804e;

    /* renamed from: f, reason: collision with root package name */
    final h f54805f;

    /* renamed from: g, reason: collision with root package name */
    private final j f54806g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f54807h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f54808i;

    /* renamed from: j, reason: collision with root package name */
    final int[] f54809j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f54810k;

    /* renamed from: l, reason: collision with root package name */
    private final int f54811l;

    /* renamed from: m, reason: collision with root package name */
    private final int f54812m;

    /* renamed from: n, reason: collision with root package name */
    private final e f54813n;

    /* renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f54800a = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f54802c = 3;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f54803d = new Handler(Looper.getMainLooper());

    private static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.i f54814b;

        /* renamed from: c, reason: collision with root package name */
        private volatile n f54815c;

        /* renamed from: androidx.emoji2.text.f$a$a, reason: collision with other inner class name */
        class C1119a extends i {
            C1119a() {
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th2) {
                a.this.f54817a.p(th2);
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                a.this.f(nVar);
            }
        }

        @Override // androidx.emoji2.text.f.b
        int a(CharSequence charSequence, int i10) {
            return this.f54814b.b(charSequence, i10);
        }

        @Override // androidx.emoji2.text.f.b
        int b(CharSequence charSequence, int i10) {
            return this.f54814b.c(charSequence, i10);
        }

        @Override // androidx.emoji2.text.f.b
        void c() {
            try {
                this.f54817a.f54805f.a(new C1119a());
            } catch (Throwable th2) {
                this.f54817a.p(th2);
            }
        }

        @Override // androidx.emoji2.text.f.b
        CharSequence d(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f54814b.j(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.f.b
        void e(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f54815c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f54817a.f54807h);
        }

        void f(n nVar) {
            if (nVar == null) {
                this.f54817a.p(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f54815c = nVar;
            n nVar2 = this.f54815c;
            j jVar = this.f54817a.f54806g;
            e eVar = this.f54817a.f54813n;
            f fVar = this.f54817a;
            this.f54814b = new androidx.emoji2.text.i(nVar2, jVar, eVar, fVar.f54808i, fVar.f54809j, androidx.emoji2.text.h.a());
            this.f54817a.q();
        }

        a(f fVar) {
            super(fVar);
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final h f54818a;

        /* renamed from: b, reason: collision with root package name */
        j f54819b;

        /* renamed from: c, reason: collision with root package name */
        boolean f54820c;

        /* renamed from: d, reason: collision with root package name */
        boolean f54821d;

        /* renamed from: e, reason: collision with root package name */
        int[] f54822e;

        /* renamed from: f, reason: collision with root package name */
        Set<AbstractC1120f> f54823f;

        /* renamed from: g, reason: collision with root package name */
        boolean f54824g;

        /* renamed from: h, reason: collision with root package name */
        int f54825h = -16711936;

        /* renamed from: i, reason: collision with root package name */
        int f54826i = 0;

        /* renamed from: j, reason: collision with root package name */
        e f54827j = new androidx.emoji2.text.e();

        protected final h a() {
            return this.f54818a;
        }

        public c b(int i10) {
            this.f54826i = i10;
            return this;
        }

        protected c(h hVar) {
            o2.i.h(hVar, "metadataLoader cannot be null.");
            this.f54818a = hVar;
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
    public static abstract class AbstractC1120f {
        public void a(Throwable th2) {
        }

        public void b() {
        }
    }

    private static class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<AbstractC1120f> f54828a;

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f54829b;

        /* renamed from: c, reason: collision with root package name */
        private final int f54830c;

        g(AbstractC1120f abstractC1120f, int i10) {
            this(Arrays.asList((AbstractC1120f) o2.i.h(abstractC1120f, "initCallback cannot be null")), i10, null);
        }

        g(Collection<AbstractC1120f> collection, int i10) {
            this(collection, i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f54828a.size();
            int i10 = 0;
            if (this.f54830c != 1) {
                while (i10 < size) {
                    this.f54828a.get(i10).a(this.f54829b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    this.f54828a.get(i10).b();
                    i10++;
                }
            }
        }

        g(Collection<AbstractC1120f> collection, int i10, Throwable th2) {
            o2.i.h(collection, "initCallbacks cannot be null");
            this.f54828a = new ArrayList(collection);
            this.f54830c = i10;
            this.f54829b = th2;
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
        final f f54817a;

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
            this.f54817a = fVar;
        }
    }

    public static f c() {
        f fVar;
        synchronized (f54797o) {
            fVar = f54799q;
            o2.i.j(fVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return fVar;
    }

    public static f j(c cVar) {
        f fVar;
        f fVar2 = f54799q;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (f54797o) {
            try {
                fVar = f54799q;
                if (fVar == null) {
                    fVar = new f(cVar);
                    f54799q = fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static boolean k() {
        return f54799q != null;
    }

    private void o() {
        this.f54800a.writeLock().lock();
        try {
            if (this.f54812m == 0) {
                this.f54802c = 0;
            }
            this.f54800a.writeLock().unlock();
            if (g() == 0) {
                this.f54804e.c();
            }
        } catch (Throwable th2) {
            this.f54800a.writeLock().unlock();
            throw th2;
        }
    }

    public int e() {
        return this.f54811l;
    }

    public int g() {
        this.f54800a.readLock().lock();
        try {
            return this.f54802c;
        } finally {
            this.f54800a.readLock().unlock();
        }
    }

    public boolean l() {
        return this.f54810k;
    }

    public void n() {
        o2.i.j(this.f54812m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m()) {
            return;
        }
        this.f54800a.writeLock().lock();
        try {
            if (this.f54802c == 0) {
                return;
            }
            this.f54802c = 0;
            this.f54800a.writeLock().unlock();
            this.f54804e.c();
        } finally {
            this.f54800a.writeLock().unlock();
        }
    }

    void p(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f54800a.writeLock().lock();
        try {
            this.f54802c = 2;
            arrayList.addAll(this.f54801b);
            this.f54801b.clear();
            this.f54800a.writeLock().unlock();
            this.f54803d.post(new g(arrayList, this.f54802c, th2));
        } catch (Throwable th3) {
            this.f54800a.writeLock().unlock();
            throw th3;
        }
    }

    void q() {
        ArrayList arrayList = new ArrayList();
        this.f54800a.writeLock().lock();
        try {
            this.f54802c = 1;
            arrayList.addAll(this.f54801b);
            this.f54801b.clear();
            this.f54800a.writeLock().unlock();
            this.f54803d.post(new g(arrayList, this.f54802c));
        } catch (Throwable th2) {
            this.f54800a.writeLock().unlock();
            throw th2;
        }
    }

    public void v(AbstractC1120f abstractC1120f) {
        o2.i.h(abstractC1120f, "initCallback cannot be null");
        this.f54800a.writeLock().lock();
        try {
            if (this.f54802c == 1 || this.f54802c == 2) {
                this.f54803d.post(new g(abstractC1120f, this.f54802c));
            } else {
                this.f54801b.add(abstractC1120f);
            }
            this.f54800a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f54800a.writeLock().unlock();
            throw th2;
        }
    }

    public void w(AbstractC1120f abstractC1120f) {
        o2.i.h(abstractC1120f, "initCallback cannot be null");
        this.f54800a.writeLock().lock();
        try {
            this.f54801b.remove(abstractC1120f);
        } finally {
            this.f54800a.writeLock().unlock();
        }
    }

    private f(c cVar) {
        this.f54807h = cVar.f54820c;
        this.f54808i = cVar.f54821d;
        this.f54809j = cVar.f54822e;
        this.f54810k = cVar.f54824g;
        this.f54811l = cVar.f54825h;
        this.f54805f = cVar.f54818a;
        this.f54812m = cVar.f54826i;
        this.f54813n = cVar.f54827j;
        C5604b c5604b = new C5604b();
        this.f54801b = c5604b;
        j jVar = cVar.f54819b;
        this.f54806g = jVar == null ? new d() : jVar;
        Set<AbstractC1120f> set = cVar.f54823f;
        if (set != null && !set.isEmpty()) {
            c5604b.addAll(cVar.f54823f);
        }
        this.f54804e = new a(this);
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
        return this.f54804e.a(charSequence, i10);
    }

    public int f(CharSequence charSequence, int i10) {
        o2.i.j(m(), "Not initialized yet");
        o2.i.h(charSequence, "charSequence cannot be null");
        return this.f54804e.b(charSequence, i10);
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
                z14 = this.f54807h;
            }
            z13 = z14;
        } else {
            z13 = true;
        }
        return this.f54804e.d(charSequence, i10, i11, i12, z13);
    }

    public void x(EditorInfo editorInfo) {
        if (m() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f54804e.e(editorInfo);
        }
    }
}
