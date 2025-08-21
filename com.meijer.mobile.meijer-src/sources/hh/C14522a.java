package hh;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import com.fullstory.FS;
import com.scandit.datacapture.core.source.CameraSettings;
import hh.C14522a;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: hh.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C14522a {

    /* renamed from: i, reason: collision with root package name */
    private static final String f135444i = "a";

    /* renamed from: j, reason: collision with root package name */
    private static final Collection<String> f135445j;

    /* renamed from: a, reason: collision with root package name */
    private boolean f135446a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f135447b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f135448c;

    /* renamed from: d, reason: collision with root package name */
    private final Camera f135449d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f135450e;

    /* renamed from: f, reason: collision with root package name */
    private int f135451f = 1;

    /* renamed from: g, reason: collision with root package name */
    private final Handler.Callback f135452g;

    /* renamed from: h, reason: collision with root package name */
    private final Camera.AutoFocusCallback f135453h;

    /* renamed from: hh.a$a, reason: collision with other inner class name */
    class C2138a implements Handler.Callback {
        C2138a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != C14522a.this.f135451f) {
                return false;
            }
            C14522a.this.h();
            return true;
        }
    }

    /* renamed from: hh.a$b */
    class b implements Camera.AutoFocusCallback {
        b() {
        }

        public static /* synthetic */ void a(b bVar) {
            C14522a.this.f135447b = false;
            C14522a.this.f();
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z10, Camera camera) {
            C14522a.this.f135450e.post(new Runnable() { // from class: hh.b
                @Override // java.lang.Runnable
                public final void run() {
                    C14522a.b.a(this.f135456a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() {
        if (!this.f135446a && !this.f135450e.hasMessages(this.f135451f)) {
            Handler handler = this.f135450e;
            handler.sendMessageDelayed(handler.obtainMessage(this.f135451f), 2000L);
        }
    }

    public void i() {
        this.f135446a = false;
        h();
    }

    public void j() {
        this.f135446a = true;
        this.f135447b = false;
        g();
        if (this.f135448c) {
            try {
                this.f135449d.cancelAutoFocus();
            } catch (RuntimeException e10) {
                FS.log_w(f135444i, "Unexpected exception while cancelling focusing", e10);
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f135445j = arrayList;
        arrayList.add(CameraSettings.FOCUS_STRATEGY_AUTO);
        arrayList.add("macro");
    }

    private void g() {
        this.f135450e.removeMessages(this.f135451f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (!this.f135448c || this.f135446a || this.f135447b) {
            return;
        }
        try {
            this.f135449d.autoFocus(this.f135453h);
            this.f135447b = true;
        } catch (RuntimeException e10) {
            FS.log_w(f135444i, "Unexpected exception while focusing", e10);
            f();
        }
    }

    public C14522a(Camera camera, i iVar) {
        C2138a c2138a = new C2138a();
        this.f135452g = c2138a;
        this.f135453h = new b();
        this.f135450e = new Handler(c2138a);
        this.f135449d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        boolean z10 = iVar.c() && f135445j.contains(focusMode);
        this.f135448c = z10;
        FS.log_i(f135444i, "Current focus mode '" + focusMode + "'; use auto focus? " + z10);
        i();
    }
}
