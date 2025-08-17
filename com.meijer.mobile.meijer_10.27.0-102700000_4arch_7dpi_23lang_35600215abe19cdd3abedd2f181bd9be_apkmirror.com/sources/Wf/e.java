package Wf;

import ag.EnumC5600b;
import ag.EnumC5601c;
import android.content.Context;
import bg.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f38656a = Pattern.compile("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*");

    public abstract boolean c();

    private static List<e> a(i iVar, Context context) {
        ArrayList arrayList = new ArrayList();
        if (iVar.m()) {
            arrayList.add(new d(iVar.n()));
        }
        if (iVar.j()) {
            arrayList.add(new c(iVar.k(), context));
        }
        if (iVar.f0()) {
            arrayList.add(new a(iVar.e0()));
        }
        if (iVar.i()) {
            arrayList.add(new b(iVar.o()));
        }
        return arrayList;
    }

    public static void d(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        }
        if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        if (str.length() > 40) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", 40));
        }
        if (str2.length() > 100) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", 100));
        }
        if (!f38656a.matcher(str).matches()) {
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    public static String e(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (EnumC5600b enumC5600b : EnumC5600b.values()) {
            if (enumC5600b.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    public static String f(String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (EnumC5601c enumC5601c : EnumC5601c.values()) {
            if (enumC5601c.toString().equals(str)) {
                return null;
            }
        }
        if (str.startsWith("_st_")) {
            return null;
        }
        return "Trace name must not start with '_'";
    }

    public static boolean b(i iVar, Context context) {
        List<e> listA = a(iVar, context);
        if (listA.isEmpty()) {
            Uf.a.e().a("No validators found for PerfMetric.");
            return false;
        }
        Iterator<e> it = listA.iterator();
        while (it.hasNext()) {
            if (!it.next().c()) {
                return false;
            }
        }
        return true;
    }
}
