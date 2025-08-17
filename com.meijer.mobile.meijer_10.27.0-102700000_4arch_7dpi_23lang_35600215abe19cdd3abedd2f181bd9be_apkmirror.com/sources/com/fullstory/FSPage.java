package com.fullstory;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class FSPage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ParcelCreator();

    public final class ParcelCreator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public FSPage createFromParcel(Parcel parcel) {
            return FS.page(parcel.readString(), parcel.readHashMap(ClassLoader.getSystemClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public FSPage[] newArray(int i10) {
            return new FSPage[i10];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract void end();

    protected abstract String getPageName();

    protected abstract Map getProperties();

    public abstract void start();

    public abstract void start(Map map);

    public abstract void updateProperties(Map map);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(getPageName());
        parcel.writeMap(getProperties());
    }
}
