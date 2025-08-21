package fsimpl;

import android.content.Context;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* loaded from: classes15.dex */
public class bA implements InterfaceC14125by {

    /* renamed from: a, reason: collision with root package name */
    private boolean f133001a = false;

    /* renamed from: b, reason: collision with root package name */
    private final Map f133002b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Set f133003c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final bB f133004d = new bB("kotlin.Lambda#invoke#l");

    private int a(String str) {
        return str.charAt(0) == '-' ? -Integer.parseInt(str.substring(1), 16) : Integer.parseInt(str, 16);
    }

    public synchronized boolean a(Context context, C14138ck c14138ck) {
        if (this.f133001a || !c14138ck.y()) {
            return true;
        }
        try {
            InputStream inputStreamOpen = context.getAssets().open("fs-compose-name-mapping.properties");
            try {
                Properties properties = new Properties();
                properties.load(inputStreamOpen);
                for (String str : ((String) properties.remove("lambda")).split(",")) {
                    if (!str.isEmpty()) {
                        this.f133003c.add(Integer.valueOf(a(str)));
                    }
                }
                for (Map.Entry entry : properties.entrySet()) {
                    this.f133002b.put(Integer.valueOf(a((String) entry.getKey())), new bB((String) entry.getValue()));
                }
                this.f133001a = true;
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                return true;
            } finally {
            }
        } catch (Throwable th2) {
            dI.a(-32763, "Error initializing Compose group mapping", th2);
            return false;
        }
    }

    @Override // fsimpl.InterfaceC14125by
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bB a(int i10) {
        return this.f133003c.contains(Integer.valueOf(i10)) ? this.f133004d : (bB) this.f133002b.get(Integer.valueOf(i10));
    }
}
