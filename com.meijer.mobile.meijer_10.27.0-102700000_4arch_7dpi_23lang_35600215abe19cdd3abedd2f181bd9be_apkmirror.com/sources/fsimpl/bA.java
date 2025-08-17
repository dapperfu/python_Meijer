package fsimpl;

import android.content.Context;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* loaded from: classes14.dex */
public class bA implements InterfaceC14000by {

    /* renamed from: a, reason: collision with root package name */
    private boolean f131751a = false;

    /* renamed from: b, reason: collision with root package name */
    private final Map f131752b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Set f131753c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final bB f131754d = new bB("kotlin.Lambda#invoke#l");

    private int a(String str) {
        return str.charAt(0) == '-' ? -Integer.parseInt(str.substring(1), 16) : Integer.parseInt(str, 16);
    }

    public synchronized boolean a(Context context, C14013ck c14013ck) {
        if (this.f131751a || !c14013ck.y()) {
            return true;
        }
        try {
            InputStream inputStreamOpen = context.getAssets().open("fs-compose-name-mapping.properties");
            try {
                Properties properties = new Properties();
                properties.load(inputStreamOpen);
                for (String str : ((String) properties.remove("lambda")).split(",")) {
                    if (!str.isEmpty()) {
                        this.f131753c.add(Integer.valueOf(a(str)));
                    }
                }
                for (Map.Entry entry : properties.entrySet()) {
                    this.f131752b.put(Integer.valueOf(a((String) entry.getKey())), new bB((String) entry.getValue()));
                }
                this.f131751a = true;
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

    @Override // fsimpl.InterfaceC14000by
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bB a(int i10) {
        return this.f131753c.contains(Integer.valueOf(i10)) ? this.f131754d : (bB) this.f131752b.get(Integer.valueOf(i10));
    }
}
