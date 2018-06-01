public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText name;
    EditText address;
    EditText age;
    String a;
    String b;
    String c;
    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = (Button) findViewById(R.id.button);
        name = (EditText) findViewById(R.id.name);
        address = (EditText) findViewById(R.id.address);
        age = (EditText) findViewById(R.id.age);
        FirebaseDatabase database= FirebaseDatabase.getInstance();
        ref=database.getReference();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = name.getText().toString();
                b = address.getText().toString();
                c = age.getText().toString();
                ref.child("name").setValue(a);
                ref.child("address").setValue(b);
                ref.child("age").setValue(c);

            }

        });
}
