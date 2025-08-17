package fsimpl;

import android.graphics.Region;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fsimpl.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14029d {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f132011a;

    static {
        HashMap map = new HashMap();
        f132011a = map;
        map.put(Region.Op.DIFFERENCE, EnumC14055e.DIFFERENCE);
        map.put(Region.Op.INTERSECT, EnumC14055e.INTERSECT);
        map.put(Region.Op.UNION, EnumC14055e.UNION);
        map.put(Region.Op.XOR, EnumC14055e.XOR);
        map.put(Region.Op.REVERSE_DIFFERENCE, EnumC14055e.REVERSE_DIFFERENCE);
        map.put(Region.Op.REPLACE, EnumC14055e.REPLACE);
    }
}
