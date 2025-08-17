package com.radiusnetworks.flybuy.sdk.data.room.dao;

import A4.g;
import android.database.Cursor;
import androidx.room.AbstractC6124j;
import androidx.room.G;
import androidx.room.N;
import androidx.room.S;
import androidx.view.AbstractC5985A;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Customer;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import w4.C17753a;
import w4.C17754b;

/* loaded from: classes11.dex */
public final class CustomerDao_Impl implements CustomerDao {
    private final G __db;
    private final AbstractC6124j<Customer> __insertionAdapterOfCustomer;
    private final S __preparedStmtOfDeleteAll;

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.CustomerDao
    public List<Customer> currentUser() {
        N nC = N.c("SELECT * FROM customers LIMIT 1", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorG = C17754b.g(this.__db, nC, false, null);
        try {
            int iE = C17753a.e(cursorG, PreferencesHelper.PREF_ID);
            int iE2 = C17753a.e(cursorG, "apiToken");
            int iE3 = C17753a.e(cursorG, "createdAt");
            int iE4 = C17753a.e(cursorG, "updatedAt");
            int iE5 = C17753a.e(cursorG, "deletedAt");
            int iE6 = C17753a.e(cursorG, "email");
            int iE7 = C17753a.e(cursorG, "name");
            int iE8 = C17753a.e(cursorG, "phone");
            int iE9 = C17753a.e(cursorG, "carType");
            int iE10 = C17753a.e(cursorG, "carColor");
            int iE11 = C17753a.e(cursorG, "licensePlate");
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(new Customer(cursorG.getInt(iE), cursorG.getString(iE2), cursorG.getString(iE3), cursorG.getString(iE4), cursorG.isNull(iE5) ? null : cursorG.getString(iE5), cursorG.isNull(iE6) ? null : cursorG.getString(iE6), cursorG.getString(iE7), cursorG.isNull(iE8) ? null : cursorG.getString(iE8), cursorG.isNull(iE9) ? null : cursorG.getString(iE9), cursorG.isNull(iE10) ? null : cursorG.getString(iE10), cursorG.isNull(iE11) ? null : cursorG.getString(iE11)));
            }
            return arrayList;
        } finally {
            cursorG.close();
            nC.h();
        }
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.CustomerDao
    public void deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        g gVarAcquire = this.__preparedStmtOfDeleteAll.acquire();
        try {
            this.__db.beginTransaction();
            try {
                gVarAcquire.b0();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfDeleteAll.release(gVarAcquire);
        }
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.CustomerDao
    public AbstractC5985A<List<Customer>> getAll() {
        final N nC = N.c("SELECT * FROM customers", 0);
        return this.__db.getInvalidationTracker().m(new String[]{"customers"}, false, new Callable<List<Customer>>() { // from class: com.radiusnetworks.flybuy.sdk.data.room.dao.CustomerDao_Impl.3
            @Override // java.util.concurrent.Callable
            public List<Customer> call() throws Exception {
                Cursor cursorG = C17754b.g(CustomerDao_Impl.this.__db, nC, false, null);
                try {
                    int iE = C17753a.e(cursorG, PreferencesHelper.PREF_ID);
                    int iE2 = C17753a.e(cursorG, "apiToken");
                    int iE3 = C17753a.e(cursorG, "createdAt");
                    int iE4 = C17753a.e(cursorG, "updatedAt");
                    int iE5 = C17753a.e(cursorG, "deletedAt");
                    int iE6 = C17753a.e(cursorG, "email");
                    int iE7 = C17753a.e(cursorG, "name");
                    int iE8 = C17753a.e(cursorG, "phone");
                    int iE9 = C17753a.e(cursorG, "carType");
                    int iE10 = C17753a.e(cursorG, "carColor");
                    int iE11 = C17753a.e(cursorG, "licensePlate");
                    ArrayList arrayList = new ArrayList(cursorG.getCount());
                    while (cursorG.moveToNext()) {
                        arrayList.add(new Customer(cursorG.getInt(iE), cursorG.getString(iE2), cursorG.getString(iE3), cursorG.getString(iE4), cursorG.isNull(iE5) ? null : cursorG.getString(iE5), cursorG.isNull(iE6) ? null : cursorG.getString(iE6), cursorG.getString(iE7), cursorG.isNull(iE8) ? null : cursorG.getString(iE8), cursorG.isNull(iE9) ? null : cursorG.getString(iE9), cursorG.isNull(iE10) ? null : cursorG.getString(iE10), cursorG.isNull(iE11) ? null : cursorG.getString(iE11)));
                    }
                    return arrayList;
                } finally {
                    cursorG.close();
                }
            }

            public void finalize() {
                nC.h();
            }
        });
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.room.dao.CustomerDao
    public void insert(Customer customer) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfCustomer.insert((AbstractC6124j<Customer>) customer);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public CustomerDao_Impl(G g10) {
        this.__db = g10;
        this.__insertionAdapterOfCustomer = new AbstractC6124j<Customer>(g10) { // from class: com.radiusnetworks.flybuy.sdk.data.room.dao.CustomerDao_Impl.1
            @Override // androidx.room.AbstractC6124j
            public void bind(g gVar, Customer customer) {
                gVar.C(1, customer.getId());
                gVar.S1(2, customer.getApiToken());
                gVar.S1(3, customer.getCreatedAt());
                gVar.S1(4, customer.getUpdatedAt());
                if (customer.getDeletedAt() == null) {
                    gVar.I(5);
                } else {
                    gVar.S1(5, customer.getDeletedAt());
                }
                if (customer.getEmail() == null) {
                    gVar.I(6);
                } else {
                    gVar.S1(6, customer.getEmail());
                }
                gVar.S1(7, customer.getName());
                if (customer.getPhone() == null) {
                    gVar.I(8);
                } else {
                    gVar.S1(8, customer.getPhone());
                }
                if (customer.getCarType() == null) {
                    gVar.I(9);
                } else {
                    gVar.S1(9, customer.getCarType());
                }
                if (customer.getCarColor() == null) {
                    gVar.I(10);
                } else {
                    gVar.S1(10, customer.getCarColor());
                }
                if (customer.getLicensePlate() == null) {
                    gVar.I(11);
                } else {
                    gVar.S1(11, customer.getLicensePlate());
                }
            }

            @Override // androidx.room.S
            public String createQuery() {
                return "INSERT OR REPLACE INTO `customers` (`id`,`apiToken`,`createdAt`,`updatedAt`,`deletedAt`,`email`,`name`,`phone`,`carType`,`carColor`,`licensePlate`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.__preparedStmtOfDeleteAll = new S(g10) { // from class: com.radiusnetworks.flybuy.sdk.data.room.dao.CustomerDao_Impl.2
            @Override // androidx.room.S
            public String createQuery() {
                return "DELETE FROM customers";
            }
        };
    }
}
