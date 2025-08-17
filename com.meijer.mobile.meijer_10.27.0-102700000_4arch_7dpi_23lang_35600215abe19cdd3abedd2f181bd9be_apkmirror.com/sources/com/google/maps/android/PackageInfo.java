package com.google.maps.android;

/* loaded from: classes7.dex */
public class PackageInfo {
    private Class<?> piClass;
    private Object piInstance;

    public Object signingSignature() {
        try {
            Object[] objArr = (Object[]) this.piClass.getField("signatures").get(this.piInstance);
            if (objArr != null && objArr.length != 0) {
                Object obj = objArr[0];
                if (obj != null) {
                    return obj;
                }
            }
            return null;
        } catch (IllegalAccessException | NoSuchFieldException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public PackageInfo(Class<?> cls, Object obj) {
        this.piClass = cls;
        this.piInstance = obj;
    }
}
