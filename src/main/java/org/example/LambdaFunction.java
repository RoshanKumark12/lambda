package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.example.Entity.Output;
import org.example.Entity.Student;


public class LambdaFunction implements RequestHandler<Student, Output>
{
    @Override
    public Output handleRequest(Student s, Context context) {
        Output obj =new Output();
        obj.setMessage(String.format("Name: - "+ s.getName()+" Address: - "+s.getAddress()+" Roll Number: - "+s.getRollno()));
        return obj;
    }
}
