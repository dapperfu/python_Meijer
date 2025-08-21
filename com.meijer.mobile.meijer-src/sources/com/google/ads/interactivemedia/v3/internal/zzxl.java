package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* loaded from: classes4.dex */
public final class zzxl {
    private final Map zza;
    private final List zzb;

    public zzxl(Map map, boolean z10, List list) {
        this.zza = map;
        this.zzb = list;
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final zzya zza(zzaca zzacaVar) throws NoSuchMethodException, SecurityException {
        zzya zzxkVar;
        Map map = this.zza;
        Type typeZzd = zzacaVar.zzd();
        Class clsZzc = zzacaVar.zzc();
        zzvt zzvtVar = (zzvt) map.get(typeZzd);
        if (zzvtVar != null) {
            return new zzxc(this, zzvtVar, typeZzd);
        }
        zzvt zzvtVar2 = (zzvt) this.zza.get(clsZzc);
        if (zzvtVar2 != null) {
            return new zzxd(this, zzvtVar2, typeZzd);
        }
        zzya zzwwVar = null;
        zzya zzxgVar = EnumSet.class.isAssignableFrom(clsZzc) ? new zzxg(typeZzd) : clsZzc == EnumMap.class ? new zzxh(typeZzd) : null;
        if (zzxgVar != null) {
            return zzxgVar;
        }
        int iZzb = zzyf.zzb(this.zzb, clsZzc);
        if (Modifier.isAbstract(clsZzc.getModifiers())) {
            zzxkVar = null;
        } else {
            try {
                Constructor declaredConstructor = clsZzc.getDeclaredConstructor(null);
                if (iZzb != 1 && (!zzye.zzb.zza(declaredConstructor, null) || (iZzb == 4 && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                    zzxkVar = new zzxi("Unable to invoke no-args constructor of " + String.valueOf(clsZzc) + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
                } else if (iZzb != 1) {
                    zzxkVar = new zzxk(declaredConstructor);
                } else {
                    String strZzf = zzabp.zzf(declaredConstructor);
                    if (strZzf != null) {
                        zzxkVar = new zzxj(strZzf);
                    } else {
                        iZzb = 1;
                        zzxkVar = new zzxk(declaredConstructor);
                    }
                }
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzxkVar != null) {
            return zzxkVar;
        }
        if (Collection.class.isAssignableFrom(clsZzc)) {
            zzwwVar = SortedSet.class.isAssignableFrom(clsZzc) ? new zzws() : Set.class.isAssignableFrom(clsZzc) ? new zzwt() : Queue.class.isAssignableFrom(clsZzc) ? new zzwu() : new zzwv();
        } else if (Map.class.isAssignableFrom(clsZzc)) {
            zzwwVar = ConcurrentNavigableMap.class.isAssignableFrom(clsZzc) ? new zzww() : ConcurrentMap.class.isAssignableFrom(clsZzc) ? new zzwx() : SortedMap.class.isAssignableFrom(clsZzc) ? new zzwy() : (!(typeZzd instanceof ParameterizedType) || String.class.isAssignableFrom(zzaca.zzb(((ParameterizedType) typeZzd).getActualTypeArguments()[0]).zzc())) ? new zzxa() : new zzwz();
        }
        if (zzwwVar != null) {
            return zzwwVar;
        }
        String strZzb = zzb(clsZzc);
        if (strZzb != null) {
            return new zzxe(this, strZzb);
        }
        if (iZzb == 1) {
            return new zzxb(this, clsZzc);
        }
        return new zzxf(this, "Unable to create instance of " + String.valueOf(clsZzc) + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    static String zzb(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#r8-abstract-class";
        }
        return null;
    }
}
