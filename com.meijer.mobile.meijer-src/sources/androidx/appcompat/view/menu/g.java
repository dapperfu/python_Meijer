package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.j;
import i.C14584g;

/* loaded from: classes.dex */
class g implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: a, reason: collision with root package name */
    private f f46508a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.c f46509b;

    /* renamed from: c, reason: collision with root package name */
    d f46510c;

    /* renamed from: d, reason: collision with root package name */
    private j.a f46511d;

    public void a() {
        androidx.appcompat.app.c cVar = this.f46509b;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void b(IBinder iBinder) {
        f fVar = this.f46508a;
        c.a aVar = new c.a(fVar.w());
        d dVar = new d(aVar.getContext(), C14584g.f136414j);
        this.f46510c = dVar;
        dVar.e(this);
        this.f46508a.b(this.f46510c);
        aVar.setAdapter(this.f46510c.a(), this);
        View viewA = fVar.A();
        if (viewA != null) {
            aVar.setCustomTitle(viewA);
        } else {
            aVar.setIcon(fVar.y()).setTitle(fVar.z());
        }
        aVar.setOnKeyListener(this);
        androidx.appcompat.app.c cVarCreate = aVar.create();
        this.f46509b = cVarCreate;
        cVarCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f46509b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f46509b.show();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(f fVar, boolean z10) {
        if (z10 || fVar == this.f46508a) {
            a();
        }
        j.a aVar = this.f46511d;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d(f fVar) {
        j.a aVar = this.f46511d;
        if (aVar != null) {
            return aVar.d(fVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f46508a.O((h) this.f46510c.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f46510c.c(this.f46508a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f46509b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f46509b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f46508a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f46508a.performShortcut(i10, keyEvent, 0);
    }

    public g(f fVar) {
        this.f46508a = fVar;
    }
}
