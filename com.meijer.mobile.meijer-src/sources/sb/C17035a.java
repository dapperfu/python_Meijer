package sb;

import android.content.Context;
import android.content.DialogInterface;
import eb.C13784a;
import eb.C13785b;

/* renamed from: sb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17035a {

    /* renamed from: a, reason: collision with root package name */
    private static final C13784a f160101a = C13785b.a(C17035a.class.getName());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sb.a$a, reason: collision with other inner class name */
    class DialogInterfaceOnCancelListenerC2497a implements DialogInterface.OnCancelListener, DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final Context f160102a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC17036b f160103b;

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (i10 == -2) {
                C13784a unused = C17035a.f160101a;
                this.f160103b.b(this.f160102a);
            } else {
                if (i10 != -1) {
                    return;
                }
                C13784a unused2 = C17035a.f160101a;
                this.f160103b.a(this.f160102a);
            }
        }

        public DialogInterfaceOnCancelListenerC2497a(Context context, InterfaceC17036b interfaceC17036b) {
            this.f160102a = context;
            this.f160103b = interfaceC17036b;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            C13784a unused = C17035a.f160101a;
        }
    }
}
