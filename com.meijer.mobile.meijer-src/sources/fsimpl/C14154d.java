package fsimpl;

import android.graphics.Region;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fsimpl.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14154d {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f133261a;

    static {
        HashMap map = new HashMap();
        f133261a = map;
        map.put(Region.Op.DIFFERENCE, EnumC14180e.DIFFERENCE);
        map.put(Region.Op.INTERSECT, EnumC14180e.INTERSECT);
        map.put(Region.Op.UNION, EnumC14180e.UNION);
        map.put(Region.Op.XOR, EnumC14180e.XOR);
        map.put(Region.Op.REVERSE_DIFFERENCE, EnumC14180e.REVERSE_DIFFERENCE);
        map.put(Region.Op.REPLACE, EnumC14180e.REPLACE);
    }
}
