package fsimpl;

import android.text.TextUtils;
import java.io.StringWriter;

/* loaded from: classes14.dex */
public class fU {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.String] */
    public static fX a(Throwable th2) {
        fX fXVar;
        String[] strArrSplit;
        StringWriter stringWriter;
        if (th2 == 0) {
            return null;
        }
        try {
            try {
                stringWriter = new StringWriter();
            } catch (Throwable th3) {
            }
        } catch (Throwable th4) {
            th2 = 0;
            fXVar = null;
        }
        try {
            fW fWVar = new fW(stringWriter);
            try {
                th2.printStackTrace(fWVar);
                th2 = stringWriter.toString();
                try {
                    if (th2 != 0) {
                        try {
                            if (th2.trim().equals(TextUtils.join(System.lineSeparator(), fWVar.f132241a))) {
                                fXVar = new fX(th2, (String[]) fWVar.f132241a.toArray(new String[fWVar.f132241a.size()]));
                            }
                            fWVar.close();
                            stringWriter.close();
                            if (fXVar != null && th2 != 0) {
                                try {
                                    strArrSplit = th2.split(System.lineSeparator());
                                } catch (Throwable th5) {
                                    strArrSplit = new String[0];
                                }
                                return new fX(th2, strArrSplit);
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            try {
                                try {
                                    fWVar.close();
                                } catch (Throwable th7) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th7);
                                }
                                throw th;
                            } catch (Throwable th8) {
                                th = th8;
                                fXVar = null;
                                try {
                                    stringWriter.close();
                                } catch (Throwable th9) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th9);
                                }
                                throw th;
                            }
                        }
                    }
                    fWVar.close();
                    stringWriter.close();
                    return fXVar != null ? fXVar : fXVar;
                } catch (Throwable th10) {
                    th = th10;
                    stringWriter.close();
                    throw th;
                }
                fXVar = null;
            } catch (Throwable th11) {
                th = th11;
                th2 = 0;
            }
        } catch (Throwable th12) {
            th = th12;
            th2 = 0;
            fXVar = null;
        }
    }
}
