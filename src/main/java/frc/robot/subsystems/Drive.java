package frc.robot.subsystems;
import java.io.File;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.Filesystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import swervelib.SwerveDrive;
import swervelib.parser.SwerveParser;
import edu.wpi.first.math.kinematics.Kinematics;



public class Drive extends SubsystemBase{
    double maximumSpeed = Units.feetToMeters(13);
    File swerveJsonDirectory = new File(Filesystem.getDeployDirectory(),"swerve");
    SwerveDrive swerveDrive;
    
    public Drive(){
        try {
            swerveDrive = new SwerveParser(new File("src//main//deploy//swerve")).createSwerveDrive(maximumSpeed);
          }
          catch(Exception IOException) {}
        
    }
    public void driveRobotRelative(Translation2d translation,double rotation){
        swerveDrive.drive(translation,rotation,false,false);
    }
    
}
