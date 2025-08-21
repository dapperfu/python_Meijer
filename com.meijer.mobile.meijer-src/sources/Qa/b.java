package Qa;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LQa/b;", "", "", "pushToken", "LX8/a;", "completionListener", "", "b", "(Ljava/lang/String;LX8/a;)V", "c", "()V", "LY9/a;", "notificationEventHandler", "a", "(LY9/a;)V", "emarsys-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(b bVar, String str, X8.a aVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPushToken");
            }
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            bVar.b(str, aVar);
        }
    }

    void a(Y9.a notificationEventHandler);

    void b(String pushToken, X8.a completionListener);

    void c();
}
