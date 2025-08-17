package gh;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import com.fullstory.FS;
import com.scandit.datacapture.core.source.CameraSettings;
import gh.C14260a;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: gh.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14260a {

    /* renamed from: i, reason: collision with root package name */
    private static final String f133378i = "a";

    /* renamed from: j, reason: collision with root package name */
    private static final Collection<String> f133379j;

    /* renamed from: a, reason: collision with root package name */
    private boolean f133380a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f133381b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f133382c;

    /* renamed from: d, reason: collision with root package name */
    private final Camera f133383d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f133384e;

    /* renamed from: f, reason: collision with root package name */
    private int f133385f = 1;

    /* renamed from: g, reason: collision with root package name */
    private final Handler.Callback f133386g;

    /* renamed from: h, reason: collision with root package name */
    private final Camera.AutoFocusCallback f133387h;

    /* renamed from: gh.a$a, reason: collision with other inner class name */
    class C2097a implements Handler.Callback {
        C2097a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != C14260a.this.f133385f) {
                return false;
            }
            C14260a.this.h();
            return true;
        }
    }

    /* renamed from: gh.a$b */
    class b implements Camera.AutoFocusCallback {
        b() {
        }

        public static /* synthetic */ void a(b bVar) {
            C14260a.this.f133381b = false;
            C14260a.this.f();
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z10, Camera camera) {
            C14260a.this.f133384e.post(new Runnable() { // from class: gh.b
                @Override // java.lang.Runnable
                public final void run() {
                    C14260a.b.a(this.f133390a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() {
        if (!this.f133380a && !this.f133384e.hasMessages(this.f133385f)) {
            Handler handler = this.f133384e;
            handler.sendMessageDelayed(handler.obtainMessage(this.f133385f), 2000L);
        }
    }

    public void i() {
        this.f133380a = false;
        h();
    }

    public void j() {
        this.f133380a = true;
        this.f133381b = false;
        g();
        if (this.f133382c) {
            try {
                this.f133383d.cancelAutoFocus();
            } catch (RuntimeException e10) {
                FS.log_w(f133378i, "Unexpected exception while cancelling focusing", e10);
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f133379j = arrayList;
        arrayList.add(CameraSettings.FOCUS_STRATEGY_AUTO);
        arrayList.add("macro");
    }

    private void g() {
        this.f133384e.removeMessages(this.f133385f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (!this.f133382c || this.f133380a || this.f133381b) {
            return;
        }
        try {
            this.f133383d.autoFocus(this.f133387h);
            this.f133381b = true;
        } catch (RuntimeException e10) {
            FS.log_w(f133378i, "Unexpected exception while focusing", e10);
            f();
        }
    }

    public C14260a(Camera camera, i iVar) {
        C2097a c2097a = new C2097a();
        this.f133386g = c2097a;
        this.f133387h = new b();
        this.f133384e = new Handler(c2097a);
        this.f133383d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        boolean z10 = iVar.c() && f133379j.contains(focusMode);
        this.f133382c = z10;
        FS.log_i(f133378i, "Current focus mode '" + focusMode + "'; use auto focus? " + z10);
        i();
    }
}
