package fsimpl;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import com.fullstory.util.Log;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: fsimpl.ch, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
abstract class AbstractC14135ch {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f133169c = Pattern.compile(".*-res/([a-zA-Z0-9._/-]+\\.[a-zA-Z]{3})-.*");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f133170d = Pattern.compile(".*-([0-9]{5,})-.*");

    /* renamed from: a, reason: collision with root package name */
    private boolean f133171a = false;

    /* renamed from: b, reason: collision with root package name */
    private int f133172b = -1;

    AbstractC14135ch() {
    }

    public abstract void a(Map map, Set set, Resources resources);

    protected final void a(Map map, Set set, Resources resources, InterfaceC14130cc interfaceC14130cc) {
        try {
            int iB = interfaceC14130cc.b();
            if (this.f133172b != iB) {
                Map mapA = interfaceC14130cc.a();
                if (mapA != null) {
                    for (Map.Entry entry : mapA.entrySet()) {
                        String str = (String) entry.getKey();
                        Typeface typeface = (Typeface) entry.getValue();
                        if (str != null && typeface != null && !map.containsKey(typeface) && !set.contains(typeface)) {
                            a(map, set, resources, str, typeface);
                        }
                    }
                }
                this.f133172b = iB;
            }
        } catch (Throwable th2) {
            this.f133171a = true;
            map.clear();
            set.clear();
            Log.e("Unexpected error scanning scanning for new typefaces", th2);
            C14232fy.a(th2);
        }
    }

    protected final void a(Map map, Set set, Resources resources, String str, Typeface typeface) throws Resources.NotFoundException, NumberFormatException {
        if (b()) {
            a(map, set, str, typeface);
        } else {
            b(map, set, resources, str, typeface);
        }
    }

    protected final void a(Map map, Set set, String str, Typeface typeface) {
        Matcher matcher = f133169c.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            if (!fY.b(strGroup)) {
                map.put(typeface, C14225fr.a("res/" + strGroup));
                return;
            }
        }
        set.add(typeface);
    }

    protected boolean a() {
        return !this.f133171a;
    }

    protected final void b(Map map, Set set, Resources resources, String str, Typeface typeface) throws Resources.NotFoundException, NumberFormatException {
        String strGroup;
        Matcher matcher = f133170d.matcher(str);
        if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
            int i10 = Integer.parseInt(strGroup);
            TypedValue typedValue = new TypedValue();
            resources.getValue(i10, typedValue, true);
            if (!fY.b(typedValue.string)) {
                map.put(typeface, C14225fr.a(typedValue.string.toString()));
                return;
            }
        }
        set.add(typeface);
    }

    protected abstract boolean b();
}
