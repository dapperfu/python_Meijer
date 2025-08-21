package j$.sun.security.action;

import java.security.PrivilegedAction;

/* loaded from: classes3.dex */
public final class a implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("file.encoding");
        if (property == null) {
            return null;
        }
        return property;
    }
}
