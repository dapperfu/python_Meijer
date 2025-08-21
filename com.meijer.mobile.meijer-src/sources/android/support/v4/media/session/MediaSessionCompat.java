package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MediaSessionCompat {

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final MediaDescriptionCompat f45784a;

        /* renamed from: b, reason: collision with root package name */
        private final long f45785b;

        /* renamed from: c, reason: collision with root package name */
        private Object f45786c;

        static class a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i10) {
                return new QueueItem[i10];
            }

            a() {
            }
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            }
            if (j10 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f45784a = mediaDescriptionCompat;
            this.f45785b = j10;
            this.f45786c = obj;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static QueueItem a(Object obj) {
            if (obj != null) {
                return new QueueItem(obj, MediaDescriptionCompat.a(f.a(obj)), f.b(obj));
            }
            return null;
        }

        public static List<QueueItem> b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return arrayList;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f45784a + ", Id=" + this.f45785b + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            this.f45784a.writeToParcel(parcel, i10);
            parcel.writeLong(this.f45785b);
        }

        QueueItem(Parcel parcel) {
            this.f45784a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f45785b = parcel.readLong();
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        ResultReceiver f45787a;

        static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int i10) {
                return new ResultReceiverWrapper[i10];
            }

            a() {
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            this.f45787a.writeToParcel(parcel, i10);
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f45787a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Object f45788a;

        /* renamed from: b, reason: collision with root package name */
        private b f45789b;

        /* renamed from: c, reason: collision with root package name */
        private Bundle f45790c;

        static class a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int i10) {
                return new Token[i10];
            }

            a() {
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f45788a;
            if (obj2 == null) {
                return token.f45788a == null;
            }
            Object obj3 = token.f45788a;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        Token(Object obj, b bVar, Bundle bundle) {
            this.f45788a = obj;
            this.f45789b = bVar;
            this.f45790c = bundle;
        }

        public b a() {
            return this.f45789b;
        }

        public void b(b bVar) {
            this.f45789b = bVar;
        }

        public void c(Bundle bundle) {
            this.f45790c = bundle;
        }

        public int hashCode() {
            Object obj = this.f45788a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable((Parcelable) this.f45788a, i10);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
