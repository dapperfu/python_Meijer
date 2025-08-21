package com.google.android.libraries.places.internal;

import De.p;
import Ee.O;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public final class zzue {
    private static final O zza = O.E("applet", "base", "embed", "math", "meta", "object", "svg", "template");
    private static final O zzb = O.y("script");
    private static final O zzc = O.y("style");
    private static final O zzd = O.E("area", "br", "col", "hr", "img", "input", "link", "param", "source", "track", "wbr");
    private static final O zzh;
    private static final O zzi;
    private final String zze;
    private final Map zzf = new LinkedHashMap();
    private final List zzg = new ArrayList();

    static {
        O.y("input");
        O.y("form");
        O.y("script");
        O.z("button", "input");
        O.z("button", "input");
        zzh = O.z("a", "area");
        zzi = O.E("alternate", "author", "bookmark", "canonical", "cite", "help", BarcodePickDeserializer.FIELD_ICON, "license", "next", "prefetch", "dns-prefetch", "prerender", "preconnect", "preload", "prev", "search", "subresource");
        O.y("form");
        O.y("input");
        O.z("input", "textarea");
        O.D("audio", "img", "input", "source", "video");
        O.y("iframe");
    }

    public final zzue zza(zzug zzugVar) {
        String str;
        O o10 = zzh;
        String str2 = this.zze;
        if (!o10.contains(str2) && !str2.equals("link")) {
            throw new IllegalArgumentException("Attribute \"href\" with a SafeUrl value can only be used by one of the following elements: ".concat(String.valueOf(o10)));
        }
        if (!str2.equals("link") || (str = (String) this.zzf.get("rel")) == null || zzi.contains(str.toLowerCase(Locale.ENGLISH))) {
            String strZza = zzugVar.zza();
            Map map = this.zzf;
            int i10 = zzub.zza;
            map.put("href", zzaqp.zzb(strZza, 65533));
            return this;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 113);
        sb2.append("SafeUrl values for the href attribute are not allowed on <link rel=");
        sb2.append(str);
        sb2.append(">. Did you intend to use a TrustedResourceUrl?");
        throw new IllegalArgumentException(sb2.toString());
    }

    public final zzud zzc() {
        StringBuilder sb2 = new StringBuilder("<");
        String str = this.zze;
        sb2.append(str);
        for (Map.Entry entry : this.zzf.entrySet()) {
            sb2.append(" ");
            sb2.append((String) entry.getKey());
            sb2.append("=\"");
            sb2.append(zzub.zza((String) entry.getValue()));
            sb2.append("\"");
        }
        boolean zContains = zzd.contains(str);
        sb2.append(">");
        if (!zContains) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
            }
            sb2.append("</");
            sb2.append(str);
            sb2.append(">");
        }
        return new zzud(sb2.toString());
    }

    public zzue(String str) {
        if ("a".matches("[a-z0-9-]+")) {
            if (!zza.contains("a")) {
                this.zze = "a";
                return;
            }
            throw new IllegalArgumentException("Element \"a\" is not supported.");
        }
        throw new IllegalArgumentException("Invalid element name \"a\". Only lowercase letters, numbers and '-' allowed.");
    }

    public final zzue zzb(String str) {
        Iterator it = Arrays.asList(zzuf.zza(str)).iterator();
        O o10 = zzd;
        String str2 = this.zze;
        p.z(!o10.contains(str2), "Element \"%s\" is a void element and so cannot have content.", str2);
        p.z(!zzb.contains(str2), "Element \"%s\" requires SafeScript contents, not SafeHTML or text.", str2);
        p.z(!zzc.contains(str2), "Element \"%s\" requires SafeStyleSheet contents, not SafeHTML or text.", str2);
        while (it.hasNext()) {
            this.zzg.add(((zzud) it.next()).zza());
        }
        return this;
    }
}
